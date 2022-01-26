import java.util.Scanner;

public class CHEAPFUEL {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int t=sc.nextInt();
        for(int i=0; i<t; i++){
            eachCase();
        }
    }

    static void eachCase(){
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();
        int fx=x+(k)*a;
        int fy=y+(k)*b;
        if(fx>fy)
            System.out.println("DIESEL");
        if(fx<fy)
            System.out.println("PETROL");
        if(fx==fy)
            System.out.println("SAME PRICE");
    }
}
