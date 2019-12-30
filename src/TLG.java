import java.util.Scanner;

public class TLG {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,x=0;
        for(int i =0;i<n;i++)
        {
            x+=sc.nextInt()-sc.nextInt();
            max=Math.max(max,x);
            min=Math.min(min,x);
        }
        if(max>0)
        {
            if(min>=0){
                System.out.println("1 "+max);
            }
            if(min<0){
                if(max>-min) System.out.println("1 "+max);
                else System.out.println("2 "+(-min));
            }
        }
        if(max<0)
        {
           System.out.println("2 "+Math.max(-max,-min));
        }
    }
}
