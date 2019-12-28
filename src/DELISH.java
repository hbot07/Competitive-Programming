import java.util.Scanner;

public class DELISH {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        byte t=sc.nextByte();
        int n=sc.nextInt();
        long d[]=new long[n];
        for(int j=0;j<t;j++) {
            for (int i = 0; i < n; i++) {
                d[i] = sc.nextInt();
            }
            System.out.println(SubArraySum(d));
        }

    }
    //Kadane's algorithm
    static long SubArraySum(long a[])
    {
        long maxLocal=a[0],maxGlobal=a[0];
        for(int i=1;i<a.length;i++)
        {
            maxLocal=Math.max(maxLocal+a[i],a[i]);
            maxGlobal=Math.max(maxGlobal,maxLocal);
        }
        long minLocal=a[0],minGlobal=a[0];
        for(int i=1;i<a.length;i++)
        {
            minLocal=Math.min(minLocal+a[i],a[i]);
            minGlobal=Math.min(minGlobal,minLocal);
        }
        return maxGlobal-minGlobal;
    }
}
