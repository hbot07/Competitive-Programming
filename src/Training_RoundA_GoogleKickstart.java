import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    static Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static void main(String[] args)
    {
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            eachCase(i);
        }
    }
    static void eachCase(int testCaseNumber)
    {
        int n=sc.nextInt(),p=sc.nextInt();
        long[] a=new long[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextLong();
        Arrays.sort(a);
        long sum=0;
        for(int i=0;i<p;i++)
            sum+=a[i];
        long minSum=p*a[p-1]-sum;
        for(int i=1;i<=n-p;i++)
        {
            sum=sum-a[i-1]+a[i+p-1];
            minSum=Math.min(minSum,p*a[i+p-1]-sum);
        }
        System.out.println("Case #"+(testCaseNumber+1)+": "+minSum);
    }
}
