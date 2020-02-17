import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SNAKEEAT {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
            oneCase();
    }
    static int n,q;
    static ArrayList<Long> ar;
    static void oneCase()
    {
        n=sc.nextInt();
        q=sc.nextInt();
        ar=new ArrayList<>(n);
        for(int i=0;i<n;i++)
            ar.add(sc.nextLong());
        Collections.sort(ar);
        for(int i=0;i<q;i++)
            compute(sc.nextLong());

    }

    static void compute(long k)
    {
        ArrayList<Long> ar1=ar;
        long answer=0;
        for(int i=0;i<n;i++){
            if(ar1.get(i)<k)
                break;
            ar1.remove(i);
            answer++;
        }
        int elementsLeft=ar1.size();
        for(int i=0;i<ar1.size();i++)
        {
            if(ar1.get(i)-k<=elementsLeft)
            {
                answer++;
                elementsLeft-=ar1.get(i)-k;
            }
            else
                break;
        }
        System.out.println(answer);

    }
}
