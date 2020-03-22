import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class KickStart2020_RoundA_Allocation {

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
            int n=sc.nextInt();
            long b=sc.nextLong();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            long cost=0;
            int j=0;
            int x=0;
            while(cost<=b && j<n)
            {
                if((cost+=a[j])<=b) x++;
                else break;
                j++;
            }
            System.out.println("Case #"+(testCaseNumber+1)+": "+x);
        }
    }

