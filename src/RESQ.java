import java.util.Scanner;

public class RESQ {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long n=sc.nextLong();
            System.out.println(minDiff(n));
        }
    }
    static long minDiff(long n)
    {long min=Long.MAX_VALUE;
        for(long i=1;i*i<=n;i++)//finding factors
        {
            if(n%i==0)
            {
                long diff=Math.abs(i-n/i);
                if(diff<min)
                    min=diff;
            }
        }
        return min;
    }
}
