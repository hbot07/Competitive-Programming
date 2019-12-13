import java.util.Scanner;
//Main concept:THE ONLY POSSIBLE PAIRS OF INTEGRAL SOLUTIONS OF X+Y=X*Y ARE (0,0) AND (2,2)
public class PLMU {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            //long a[]=new long[n];
            long sum1=0,sum2=0;
            for(int j=0;j<n;j++)
            {
                if(sc.nextInt()==2) sum1++;
                if(sc.nextInt()==0) sum2++;
            }
            System.out.println((sum1*(sum1-1)+sum2*(sum2-1))/2);

        }
    }
}
