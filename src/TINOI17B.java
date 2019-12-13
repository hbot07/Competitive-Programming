import java.util.Scanner;

public class TINOI17B {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        long s=sc.nextLong();
        long xv=0;
        long e[]=new long[n];
        for(int i=0;i<n;i++)
        {
            e[i]=sc.nextLong();
        }




    }

    static long cubeOfSumOfDigits(long n)
    {long sum=0;
        //finding sum of digits
     while(n!=0)
     {
         sum+=n%10;
         n/=10;
     }


        return sum*sum*sum;

    }}
