import java.util.ArrayList;
import java.util.Scanner;

public class CHCBOX {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
            eachCase();
    }
    static void eachCase()
    {
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=0;
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
            if(max<a[i]) max=a[i];
        }
        ArrayList<Integer> indexes=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(a[i]==max)
                indexes.add(i);
        }
        if(indexes.size()>n/2)
        {
            System.out.println(0);
            return;
        }
        if(indexes.size()==1)
        {
            System.out.println(n/2);
            return;
        }
        int count=0;
        outer: for(int k=0;k<n;k++)
        {
            for(int i=0;i<indexes.size();i++)
            {
                indexes.set(i,indexes.get(i)+k>n-1?indexes.get(i)+k-n:indexes.get(i)+k);
            }
            for(int i=0;i<indexes.size();i++)
            {
                if(indexes.get(i)<n/2)
                    continue outer;
            }
            count++;
        }
        System.out.println(count);
    }
}
