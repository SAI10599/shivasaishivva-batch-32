package Assignment_12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("John");
        students.add("Alice");
        students.add("Bob");
        students.add("Emily");
        students.add("David");

        System.out.println(students);

        String[] New = students.toArray(new String[students.size()]);

        for(int i=0;i<New.length;i++){
            System.out.println(New[i]);
        }



    }
}