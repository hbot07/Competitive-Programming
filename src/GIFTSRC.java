import java.util.Scanner;

public class GIFTSRC {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
            eachCase();
    }
    static void eachCase()
    {
        int n=sc.nextInt();
        String s=sc.next();
        int x=0,y=0;
        switch(s.charAt(0))
        {
            case 'L':x--; break;
            case 'R':x++; break;
            case 'U':y++; break;
            case 'D':y--; break;
        }
        String s2="";
        for(int i=0;i<n;i++)
        {
            s2+=s.charAt(i)=='R' || s.charAt(i)=='L'?'x':'y';
        }
        for(int i=1;i<n;i++)
        {
            if(s2.charAt(i)!=s2.charAt(i-1))
            {
                switch(s.charAt(i))
                {
                    case 'L':x--; break;
                    case 'R':x++; break;
                    case 'U':y++; break;
                    case 'D':y--; break;
                }
            }
        }
        System.out.println(x+" "+y);
    }
}
