package Assignment_4;

public class Fizzbuzz {

    public void FIZZ(int x) {
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            }
            else if(i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}