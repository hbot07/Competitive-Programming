import java.util.Scanner;

public class EQUALCOIN {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int t=sc.nextInt();
        for(int i=0; i<t; i++){
            eachCase();
        }
    }
    static void eachCase(){
        long x=sc.nextLong();
        long y=sc.nextLong();
        if(x%2==1){
            System.out.println("NO");
            return;
        }
        if(y%2==1 && x==0){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
