import java.util.Scanner;

public class RodCutting {
    static int[] a;
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {

        int n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
       System.out.println(r(n));

    }
    static int r(int n)
    {if(n==1) return a[0];
    if(n==0) return 0;

        int max=a[n-1];
        for(int i=1;i<n;i++)
        {
            max=Math.max(r(i)+r(n-i),max);
        }
        return max;
    }




}
