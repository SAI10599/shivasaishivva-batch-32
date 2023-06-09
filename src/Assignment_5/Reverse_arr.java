package Assignment_5;

public class Reverse_arr{

    public int[] swap(int[] a){
        int first=0;
        int last=a.length-1;
        int temp;
        int i=0;

        //System.out.println(first);
        //System.out.println(last);

        if ((a.length%2)==0){
            while(i<((a.length)/2)){

                temp=a[first];
                a[first]=a[last];
                a[last]=temp;


                first++;
                last--;
                i++;

            }

        }
        else if ((a.length%2)!=0){
            while(i<((a.length-1)/2)){

                temp=a[first];
                a[first]=a[last];
                a[last]=temp;


                first++;
                last--;
                i++;

            }

        }
        return a;

    }
}