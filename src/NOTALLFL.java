import java.util.Scanner;

public class NOTALLFL {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
            oneCase();
    }
    static void oneCase()
    {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++) {
            ar[i]=sc.nextInt();
        }
        int max=0;
        for(int i=1;i<=k;i++)
        {
            max=Math.max(subtask1(i,ar),max);
        }
        System.out.println(max);
    }
    static int subtask1(int a,int[] ar)
    {
        int l=0,max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]!=a)
            {
                l++;
            }
            else{
                l=0;
            }
            max=Math.max(l,max);

        }
        return max;
    }
}
