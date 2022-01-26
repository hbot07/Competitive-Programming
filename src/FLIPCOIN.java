import java.util.Scanner;

public class FLIPCOIN {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int n=sc.nextInt();
        byte[] ar= new byte[n];
        int q=sc.nextInt();
        for(int i=0; i<q; i++){
            byte zero_one=sc.nextByte();
            int a=sc.nextInt(),b=sc.nextInt();
            switch(zero_one){
                case 0: for(int j=a; j<=b; j++){
                    ar[j]= (byte) (ar[j]==0?1:0);}
                    break;

                case 1: int sum=0;
                    for(int j=a; j<=b; j++){
                    sum+=ar[j];}
                    System.out.println(sum);
                    break;
            }
        }
    }
}
