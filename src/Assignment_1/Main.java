package Assignment_1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        String name = student.getName();
        System.out.println("Name: " + name);
        student.setName("Jane Smith");
        name = student.getName();
        System.out.println("Name: " + name);
    }
}

