import java.util.Scanner;

public class CSUB {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {   int n=sc.nextInt();
            String s=sc.next();
            long freq=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='1')
                    freq++;
            }
            System.out.println(freq*(freq+1)/2);//Derived using Combionatrics
        }
    }
}
