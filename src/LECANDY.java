import java.util.Scanner;
public class LECANDY {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        for(long i=0;i<t;i++)
        {
            long n=sc.nextLong();
            long c=sc.nextLong();
            long sum=0;
            for(long j=0;j<n;j++)
            {
                sum+=sc.nextLong();
            }
            if(sum<=c)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
