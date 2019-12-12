import java.util.Scanner;

public class CTY2 {
    public static void main(String[] args)
    {
        //Dynamic Programming
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] denominations=new int[m];
        for(int i=0;i<m;i++)
        {
            denominations[i]=sc.nextInt();

        }
        long[] dp=new long[n+m+10];
        dp[0]=1;//number of ways of getting sum=0
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dp[i+denominations[j]]+=dp[i];
            }
        }

        System.out.println(dp[n-1]);
    }}
