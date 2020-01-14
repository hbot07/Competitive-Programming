import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class STICKS {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
            oneCase();
    }

    static void oneCase()
    {
        int n=sc.nextInt();
        Integer a[]=new Integer[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        if(n<4){
            System.out.println(-1);
            return;
        }
        Arrays.sort(a, Collections.reverseOrder());
        long area=1;
        int i=0;
        boolean foundSomething=false;
        for(;i<n-1;i++)
        {
            if(a[i]==a[i+1]){
                area*=a[i];
                foundSomething=true;
                break;
            }
        }
        if(!foundSomething)
        {
            System.out.println(-1);
            return;
        }
        for(i=i+2;i<n-1;i++)
        {
            if(a[i]==a[i+1]){
                area*=a[i];
                foundSomething=false;
                break;
            }
        }
        if(foundSomething)
            area=-1;
        System.out.println(area);

    }
}
