package Assignment_4;

public class Person_age {

    public void Person(int x){
        if(x>13 && x<19){
             System.out.println("teen");
         }
        if(x<13){
            System.out.println("kid");
        }
        if(x>19){
            System.out.println("adult");
        }
    }
}
