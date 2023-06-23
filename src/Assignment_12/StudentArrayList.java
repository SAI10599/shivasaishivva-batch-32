package Assignment_12;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class StudentArrayList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("shiva", "sai", 3.5));
        students.add(new Student("Ali", "Mo", 3.8));
        students.add(new Student("Vamshi", "krish", 2.9));
        students.add(new Student("sai", "Naga", 3.2));
        students.add(new Student("sravan", "murali", 3.9));


        double averageGpa = students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);;


        students.removeIf(student -> student.getGpa() < averageGpa);


        students.forEach(System.out::println);
    }
}
