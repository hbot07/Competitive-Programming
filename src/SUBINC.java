import java.util.Scanner;

public class SUBINC {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextLong();
            }
            int freq=0;
            for(int j=0;j<n-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    freq++;
                }
            }
            freq=freq>0?freq+1:freq;
            System.out.println(freq+n);
        }
    }
}
