package Assignment_11;

import java.util.Arrays;

public class Captalize {


    public static void main(String[] args){
        String[] arr={"shiva","manohar","sai","vamshi"};

        Arrays.stream(arr)
                .map(rrr -> rrr.substring(0,1).toUpperCase()+rrr.substring(1))
                .sorted()
                .forEach(n -> System.out.println(n));

    }
}
