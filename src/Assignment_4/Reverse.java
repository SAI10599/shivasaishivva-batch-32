package Assignment_4;

public class Reverse {

    public int Rev(int num){
        int final_number;

        int Y=0;


        while(num>0){

            int x =num%10;

            //System.out.println("x : "+x);
            //System.out.println("Y : "+Y);
            //System.out.println("num : "+num);


            final_number=Y*10+x;
            num=(num-x)/10;
            Y=final_number;


            //System.out.println(final_number);


        }
        return Y;

    }
}
