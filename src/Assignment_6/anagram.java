package Assignment_6;

import java.util.Arrays;

public class anagram {

    public String anagr(String S, String A){

        char[] first=S.toCharArray();
        char[] second=A.toCharArray();
        String a="";
        int count=0;

        Arrays.sort(first);
        Arrays.sort(second);

        if (first.length!=second.length){
            a="Not Anagram";


        }
        else {
            for(int i=0; i<first.length;i++){
                if(first[i]!=second[i]){
                    a="Not Anagram";
                    break;
                }
            }
            a="is an anagram";
            }
        return a;
        }

    }



