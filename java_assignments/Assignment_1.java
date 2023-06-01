public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

public class Main {
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