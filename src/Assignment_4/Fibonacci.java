package Assignment_4;

public class Fibonacci {

    public void Fibona(int x) {

        int y=0;
        int z=1;
        int n;
        System.out.println(y);
        System.out.println(z);

        for (int i = 0; i <= x; i++) {
            n=y+z;
            System.out.println(n);
            y=z;
            z=n;


            }

        }
    }
