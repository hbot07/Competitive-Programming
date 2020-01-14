import java.util.Arrays;
import java.util.Scanner;

public class TACHSTCK {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int n=sc.nextInt();
        long d=sc.nextLong();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int freq=0;
        for(int i=0;i<n-1;i++){
            if(a[i+1]-a[i]<=d)
            {
                freq++;
                i++;
            }
        }
        System.out.println(freq);

    }
}
