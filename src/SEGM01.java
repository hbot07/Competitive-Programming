import java.util.Scanner;

public class SEGM01 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            System.out.println(check(s));
        }
    }
    static String check(String s)
    {
        if(s.indexOf("1")!=-1)
        {
            if(s.substring(s.indexOf("1"),s.lastIndexOf("1")).indexOf("0")==-1)
                return "YES";
        }
        return "NO";
    }
}
