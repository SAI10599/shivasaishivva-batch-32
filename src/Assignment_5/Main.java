package Assignment_5;

public class Main {
    public static void main(String[] args){
        int arr[]= {1,2,3,4,5};
        int arr_2[]= {1,2,3,4,5};

        Find_inte n=new Find_inte();
        Reverse_arr r=new Reverse_arr();
        rotation ro=new rotation();


        n.find(arr);
        int[] ar=r.swap(arr);

        System.out.println("Reverse array");
        for(int i=0;i<=ar.length-1;i++){
            System.out.println(ar[i]);
        }

        int ra[]=ro.rotate(arr_2,2);

        System.out.println("rotation array array");
        for(int i=0;i<=ra.length-1;i++){
            System.out.println(ra[i]);
        }

    }
}
