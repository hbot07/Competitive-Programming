import java.util.Scanner;

public class INOI1201 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum1=0,sum2=Long.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            sum1+=sc.nextInt();
            sum2+=Math.min(sum2,sc.nextInt()+sc.nextInt());
        }
        System.out.println(sum1+sum2);
    }
}
