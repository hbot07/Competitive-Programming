import java.util.Arrays;
import java.util.Scanner;

public class BRKBKS {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int s=sc.nextInt();
            int[] b={sc.nextInt(),sc.nextInt(),sc.nextInt()};
            int steps=1;
            Arrays.sort(b);
            int s1=s;
            s1-=b[0];
            if(s1<=0)
            {
                steps++;
                s1=s;
            }
            s1-=b[1];
            if(s1<=0)
            {
                steps++;
            }
            System.out.println(steps);
        }
    }
}
