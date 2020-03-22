import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KickStart2020_RoundA_Workout {
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
        int n=sc.nextInt(),k=sc.nextInt();
        ArrayList<Long> a=new ArrayList<>();
        for(int i=0;i<n;i++)
            a.add(sc.nextLong());
        for(int x=0;x<k;x++)
        {
            int maxi=0;
            for(int i=0;i<a.size()-1;i++)
            if(a.get(i+1)-a.get(i)>a.get(maxi+1)-a.get(maxi))
                maxi=i;
            a.add(maxi+1,(a.get(maxi)+a.get(maxi+1))/2);
        }
        //for(long i: a) System.out.println(i);
        long max=0;
        for(int i=0;i<a.size()-1;i++)
        {
            max=Math.max(max,a.get(i+1)-a.get(i));
        }
        System.out.println("Case #"+(testCaseNumber+1)+": "+max);
    }
}
