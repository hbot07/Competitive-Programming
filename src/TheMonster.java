import java.util.Scanner;

public class TheMonster {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt(), a=sc.nextInt();
        int d= sc.nextInt(), c=sc.nextInt();
        outer: for(int i=0; i<=10000; i++){
            //System.out.println(i);
            int j=0;
            while(a+i*b>=c+j*d){
                //System.out.println(j);
                if(a+i*b==c+j*d){
                    System.out.println(a+i*b);
                    System.exit(0);
                }
                j++;
            }
        }
        System.out.println(-1);
    }
}
