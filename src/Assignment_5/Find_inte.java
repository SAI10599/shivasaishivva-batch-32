package Assignment_5;

public class Find_inte {

    public void find(int a[]){
        int compare_s=a[0];
        int compare_g=a[0];

        for(int i=1;i<a.length;i++){
            if (a[i]<compare_s){
                compare_s=a[i];

            }

        }
        System.out.println("smallest : "+compare_s);

        for(int i=1;i<a.length;i++){
            if (a[i]>compare_g){
                compare_g=a[i];

            }

        }
        System.out.println("Largest :" + compare_g);
    }





}

