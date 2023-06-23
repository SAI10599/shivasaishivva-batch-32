package Assignment_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LastElement {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("John");
        students.add("Alice");
        students.add("Bob");
        students.add("Emily");
        students.add("David");

        System.out.println(students);

        if (!students.isEmpty()) {
            students.remove(students.size() - 1);
        }

        System.out.println("After deleting last string: "+students);


    }
}
