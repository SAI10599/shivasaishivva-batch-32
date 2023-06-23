package Assignment_13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Stud{

    private String firstName;
    private String lastName;
    private double GPA;

    public Stud(String firstName,String lastName,double GPA){
        this.firstName=firstName;
        this.lastName=lastName;
        this.GPA=GPA;

    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return GPA;
    }

    public String toString(){
        return firstName+" "+lastName+" "+GPA;
    }
}

public class HashMap1 {
    public static void main(String[] args){


        HashMap<String,Stud> Students=new HashMap<String,Stud>();

        Students.put("John", new Stud("John", "Doe", 3.8));
        Students.put("Alice", new Stud("Alice", "Smith", 3.9));
        Students.put("Bob", new Stud("Bob", "Johnson", 3.6));
        Students.put("Sarah", new Stud("Sarah", "Williams", 3.7));
        Students.put("Michael", new Stud("Michael", "Brown", 3.5));
        Students.put("Emily", new Stud("Emily", "Davis", 3.4));
        Students.put("David", new Stud("David", "Anderson", 3.8));
        Students.put("Olivia", new Stud("Olivia", "Miller", 3.9));

        for(Map.Entry<String,Stud> StudentsEntry: Students.entrySet()){
            System.out.println(StudentsEntry.getKey()+" "+StudentsEntry.getValue());

        }
        System.out.println("\n");
        System.out.println("Using for each Loop: ");

        System.out.println("\n");
        Students.forEach((key,Value) -> System.out.println(key+" "+Value));

        System.out.println("\n");
        System.out.println("Using Iterator: ");


        Iterator<String> i=Students.keySet().iterator();
        while(i.hasNext()){
            String key = i.next();
            Stud student = Students.get(key);
            System.out.println("Key: "+key+" "+"firstName: "+student.getFirstName()+" "+"Last Name: "+student.getLastName()+" "+"GPA: "+student.getGpa());

        }



    }

    }
