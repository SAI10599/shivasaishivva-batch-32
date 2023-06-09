package Assignment_6;

public class CheckRotation {

    public void C_rotation(String s, String a){
        String con=s.concat(a);

        if (con.contains(a)){

            System.out.println("Strings are rotation of each other");
        }
        else{
            System.out.println("Strings are not rotation of each other");
        }

    }
}
