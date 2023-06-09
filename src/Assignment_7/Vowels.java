package Assignment_7;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Vowels {

    public int find_vowels(String word){
        ArrayList<Character> vow=new ArrayList<Character>();
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');
        int count=0;

        for(int i=0;i<word.length();i++)
            if(vow.contains(word.charAt(i))){
                count++;
        }

        return count;


    }
}
