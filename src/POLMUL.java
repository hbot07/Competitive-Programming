import java.util.Scanner;

public class POLMUL {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {

        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            oneCase();

        }
    }

    static void oneCase()
    {
        int n=sc.nextInt(),m=sc.nextInt();
        int[] an=new int[n],am=new int[m];
        for(int i=0;i<n;i++)
        {
            an[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            am[i]=sc.nextInt();
        }
        long[] product=new long[m+n-1];
        for(int i=0;i<m+n-1;i++)
            product[i]=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                product[i+j]+=an[i]*am[j];
            }
        }
        for(int i=0;i<m+n-1;i++)
            System.out.println(product[i]);
    }

}
