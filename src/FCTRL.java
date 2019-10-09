import java.util.Scanner;

public class FCTRL {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        for(int i=0;i<t;i++)
        {
            System.out.println(Z(sc.nextLong()));
        }
    }

    static long Z(long n)
    {long sum=0;
        while(n>0)
        {long i=1;
            sum+=(int)(n/Math.pow(5,i));
            n/=Math.pow(5,i);
            i++;
        }
        return sum;
    }
}
