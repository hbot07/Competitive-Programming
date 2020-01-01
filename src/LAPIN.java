import java.util.Arrays;
import java.util.Scanner;

public class LAPIN {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println(checkLapin(sc.next()));
        }

    }

    static String checkLapin(String s)
    {String s1,s2;
        if(s.length()%2==0)
        {
             s1=s.substring(0,s.length()/2);
             s2=s.substring(s.length()/2);
        }
        else
        {
             s1=s.substring(0,s.length()/2);
             s2=s.substring((s.length()/2)+1);
        }
        if(compare(s1,s2))
            return "YES";
        return "No";
    }

    static boolean compare(String a,String b)
    {
        char s1[]=a.toCharArray();
        char s2[]=b.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);
    }
}
