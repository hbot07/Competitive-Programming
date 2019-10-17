import java.util.Arrays;
import java.util.Scanner;

public class GDSUB {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        int k=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }
        Arrays.sort(arr);
        long temp=arr[0];
        int arr2[]=new int[n];
        long freq=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=temp)
            {
                arr[i]=temp;
                freq++;
            }
        }
        System.out.println(Math.pow(2,freq)%1000000007 );
    }

}
