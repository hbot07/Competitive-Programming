import java.util.Scanner;

public class FLOW004 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
        String num=sc.next();
        System.out.println(num.charAt(0)-'0'+num.charAt(num.length()-1)-'0');
    }}
}
