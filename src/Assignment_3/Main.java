package Assignment_3;

import static Assignment_3.Faculty.faculty_exp;

public class Main {

    public static void main(String[] args){

        Student student=new Student();
        Faculty fac=new Faculty(25,5);
        Faculty fac2=new Faculty(24);
        Sports sport=new Sports();




        student.getMarks();
        student.getPercentage();


        System.out.println(fac2.faculty_count);

        System.out.println(faculty_exp(12));

        System.out.println(sport.view_sport_id());




    }
}
