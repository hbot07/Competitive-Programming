import java.util.Scanner;
public class HORSES {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            eachcase();
        }
    }
    static void eachcase()
    {
        int n=sc.nextInt();
        long[] a=new long[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        long min=Long.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                min=Math.min(min,Math.abs(a[i]-a[j]));
            }
        }
        System.out.println(min);
    }
}
