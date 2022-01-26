import java.util.Scanner;

public class Chocolate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        long product=1;
        int last1=-1;
        for(int i=0; i<n; i++){
            if(sc.nextInt()==1){
                if(last1!=-1){
                    product*=i-last1;
                }
                last1=i;
            }
        }
        System.out.println(last1==-1?0:product);
    }
}
