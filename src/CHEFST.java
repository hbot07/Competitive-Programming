import java.util.Scanner;

public class CHEFST {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i =0;i<t;i++)
        {
            long n1=sc.nextLong(),n2=sc.nextLong(),m=sc.nextLong();
            long x=m*(m+1)/2;
            if(x>=Math.max(n1,n2))
                System.out.println(Math.abs(n1-n2));
            else if(x<Math.max(n1,n2) && x>=Math.min(n1,n2))
                System.out.println(Math.abs(n1-n2));
            else
                System.out.println(n1-x+n2-x);
        }
    }
}
