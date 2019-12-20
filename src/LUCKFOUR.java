import java.util.Scanner;

public class LUCKFOUR {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            int freq=0,from=0;
            while(s.indexOf("4",from)!=-1)
            {
                freq++;
                from=s.indexOf("4",from)+1;
            }
            System.out.println(freq);

        }    }
}
