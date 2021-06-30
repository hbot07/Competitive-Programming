import java.util.Scanner;

public class MUFFINS3 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            onecase();
        }
    }
    static void onecase(){
        int n=sc.nextInt();
        System.out.println((int)Math.ceil((n+0.1)/2.0));
    }
}
