package Assignment_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CSVreader{
    public static void main(String[] args){
        String csvFile = "C:\\Users\\saish\\Downloads\\Java_Assignments_32_batch\\src\\Assignment_7\\Students.csv";
        List<Stud> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String firstName = data[0];
                String lastName = data[1];
                double gpa = Double.parseDouble(data[2]);
                Stud student = new Stud(firstName, lastName, gpa);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(students);

        for (Stud student : students) {
            System.out.println(student.getFirstName() + ", " + student.getLastName() + ", GPA: " + student.getGpa());
        }
    }
}





