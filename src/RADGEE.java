import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RADGEE {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
       int t=sc.nextInt();
       for(int i=0;i<t;i++)
       {
           oneCase();
       }
    }
    static void oneCase()
    {
        int n=sc.nextInt(),m=sc.nextInt();
        Queue<Long> qn1=new LinkedList<>();
        Queue<Long> qn2=new LinkedList<>();
        Queue<Long> qm=new LinkedList<>();
        for(int i=0;i<n;i++)
            qn1.add(sc.nextLong());
        for(int i=0;i<n;i++)
            qn2.add(sc.nextLong());
        for(int i=0;i<m;i++)
            qm.add(sc.nextLong());
        long p1=0,p2=0;
        while(!qm.isEmpty())
        {
            long n1=qn1.remove();
            long n2=qn2.remove();
            if(n1>n2)
            {
                qn1.add(qm.remove());
                qn2.add(qm.remove());
                p1++;
            }
            else
            {
                qn2.add(qm.remove());
                qn1.add(qm.remove());
                p2++;
            }
        }
        while(!qn1.isEmpty())
        {
            long n1=qn1.remove();
            long n2=qn2.remove();
            if(n1>n2)
            {
                p1++;
            }
            else
            {
                p2++;
            }

        }
        if(p1>p2)
            System.out.println("Radhesh wins");
        if(p1==p2)
            System.out.println("Tie");
        if(p1<p2)
            System.out.println("Geethakoomaree wins");
        }
}
