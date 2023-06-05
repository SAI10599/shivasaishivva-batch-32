package Assignment_3;

public class Faculty extends Department{

    public int faculty_count;
    static int faculty_experience;


    public Faculty(int x, int y){
        faculty_count=x;
        Department_count=y;

        System.out.println("faculty count is "+  faculty_count + "and" + "department count is " + Department_count);


    }

    public Faculty(int x){
        faculty_count=x;


    }

    static int faculty_exp(int x){
        faculty_experience=x;
        return x;
    }



}
