import java.util.Scanner;

public class MAKEPAL {
    static Scanner sc= new Scanner(System.in);
    public static void main(String args[]){
        int t=sc.nextInt();
        for(int i=0; i<t; i++){
            eachCase();
        }
    }

    static void eachCase(){
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
        for(int i=0; i<n; i++){
            a[i]=(int)((sc.nextLong())%2);
            sum+=a[i];
        }
        /*if(sum%2==0){
            System.out.println(sum/2);
        }
        if(sum%2==1){
            System.out.println(sum/2);
        }*/
        System.out.println(sum/2);
    }
}
