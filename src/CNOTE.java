import java.util.Scanner;

public class CNOTE {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=sc.nextInt(),y=sc.nextInt(),k=sc.nextInt(),n=sc.nextInt();
            int pagesRequired=x-y;
            boolean check=false;
            for(int j=0;j<n;j++)
            {int pages=sc.nextInt(),price=sc.nextInt();
                if(pages>=pagesRequired)
                {
                    if(price<=k)
                    {
                        check=true;
                        break;
                    }
                }
            }
            if(check) System.out.println("LuckyChef");
            else System.out.println("UnluckyChef");

        }
    }
}
