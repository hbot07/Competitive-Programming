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
        if(indexes.size()==0)
        {
            System.out.println(n+1);
            return;
        }
        if(indexes.size()==1)
        {
            System.out.println(n/2);
            return;
        }
        int index;
        int count=0;
        for(int k=0;k<=n;k++)
        {
            boolean flag=true;
            index=n-k;
            for(int i=0;i<n/2;i++)
            {
                index=index<n?index:index-n;
                if(a[index]==max)
                {
                    flag=false;
                    break;
                }
                index++;
            }
            if(flag) count++;
        }
        System.out.println(count);
    }
}
