import java.util.Scanner;

public class RAINBOWA {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i =0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++)
                a[j]=sc.nextInt();
            System.out.println(check(a));
        }
    }
    static String check(int[] a)
    {int max=0;
        for(int i:a) {
            if (i > max) max=i;
        }
        if(max!=7) return "no";
        int n=1;
        for(int i=0;i<Math.ceil(a.length/2.0);i++)
        {
            if(!(a[i]==a[a.length-1-i] && a[i]==n))
            {
                return "no";
            }
            if(a[i+1]>a[i]) n++;

        }
        return "yes";



    }
}
