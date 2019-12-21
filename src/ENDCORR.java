import java.util.Scanner;

public class ENDCORR {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long a[]=new long[n+m];
        int index=0;long input;
        for(long i=0;i<m+n;i++)
        {input=sc.nextLong();
            if(input==-1)
            {
                System.out.println(max(a));
            }
            else
            {
                a[index]=input;
                index++;
            }
        }
    }
    static long max(long a[])
    {
        int maxIndex=0;
        int i=0;
        while(a[i]!=0)
        {
            if(a[i]>a[maxIndex])
            {
                maxIndex=i;
            }
            i++;
        }
        long max=a[maxIndex];
        a[maxIndex]=-1;
        return max;
    }
}
