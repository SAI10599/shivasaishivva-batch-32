package Assignment_6;

public class Main {
    public static void main(String[] args){

        String S="Find number of vowels in this line";

        Vowels v1=new Vowels();
        System.out.println("number os vowels in the string:");
        System.out.println(v1.find_vowels(S));


        anagram a1=new anagram();
        System.out.println("\n");
        System.out.println("checking if the Strings are Anagram:");
        System.out.print(a1.anagr("qwert yuiop","qwert yuio"));

        ReverseEachWord r1=new ReverseEachWord();
        System.out.println("\n");
        System.out.println("Reverse each word in the String:");
        r1.ReverseEach("Java BTCH 32");

        CheckRotation check=new CheckRotation();
        System.out.println("\n");
        System.out.println("Checking of one String is rotation of other:");
        check.C_rotation("JavaJ2eeStrutsHibernate","StrutsHibernateJavaJ2ee");




    }
}
