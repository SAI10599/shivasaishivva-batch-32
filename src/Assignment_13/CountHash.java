package Assignment_13;

import java.util.HashMap;
import java.util.Map;

public class CountHash{
        public static void main(String[] args) {
            String numbers = "test string";
            numbers=numbers.replaceAll(" ","");
            char[] numb=numbers.toCharArray();


            HashMap<Character, Integer> num=new HashMap<Character, Integer>();

            for(char s:numb){
                if(num.containsKey(s)){
                    num.put(s,num.get(s)+1);
                }
                else{
                    num.put(s,1);
                }
            }

            for(Map.Entry<Character, Integer> news:num.entrySet()){
                System.out.println(news.getKey()+" "+news.getValue());
            }


        }
    }

