import java.util.Scanner;

public class EuclidsGCDAlgorithm {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        System.out.println(gcd(sc.nextInt(),sc.nextInt()));
    }
    static int gcd(int a,int b)
    {
        int max=Math.max(a,b);
        int min=Math.min(a,b);
        int rem=max%min;
        while(rem!=0)
        {
            max=min;
            min=rem;
            rem=max%min;
        }
        return min;
    }
}
