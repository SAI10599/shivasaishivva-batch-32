package Assignment_5;

public class rotation{


    public int[] rotate(int[] x, int y){
        int[] new_array=new int[x.length];
        int z=0;
        // used for second for to increment


        for(int i=y;i<=x.length-1;i++){
            new_array[z]=x[i];

            z++;
        }

        for(int i=0;i<y;i++){

            new_array[z]=x[i];

            z++;

        }
        return new_array;


    }
}
