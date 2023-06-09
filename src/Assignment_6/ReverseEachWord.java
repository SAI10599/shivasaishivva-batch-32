package Assignment_6;



public class ReverseEachWord {

    public void ReverseEach(String S){

        String[] new_arr=S.split(" ");

        StringBuilder sb = new StringBuilder();
        for(String word: new_arr)
        {
            StringBuilder rword = new StringBuilder(word);
            rword=rword.reverse();
           sb.append(rword).append(" ");
        }

        System.out.println("\n");
        System.out.println(sb);






    }
}
