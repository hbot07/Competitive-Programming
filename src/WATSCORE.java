import java.util.Scanner;

public class WATSCORE {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            long s[]=new long[11];
            for(int k=0;k<n;k++)
            {int q=sc.nextInt()-1;
               s[q]=Math.max(s[q],sc.nextInt());
            }
            long sum=0;
            for(int j=0;j<8;j++)
            {
                sum+=s[j];
            }
            System.out.println(sum);
        }

    }
}
