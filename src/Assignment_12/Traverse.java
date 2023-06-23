package Assignment_12;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Traverse {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("John");
        students.add("Alice");
        students.add("Bob");
        students.add("Emily");
        students.add("David");

        for(int i=0;i<students.size();i++){
            System.out.println(students.get(i));
        }
        System.out.println("\n");

        for(String s :students){
            System.out.println(s+ " ");

        }

        System.out.println("\n");

        Iterator i= students.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("\n");
        students.parallelStream()
                .forEach(s->System.out.println(s));

    }
}
