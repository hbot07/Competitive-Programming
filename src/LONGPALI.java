import java.util.Scanner;

public class LONGPALI {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String LongestPalin="";
        for(int start=0;start<s.length()-1;start++)
        {int end=s.indexOf(s.charAt(start),start+1);
            while(end!=-1)
            {
                if(checkPalin(s.substring(start,end+1))&&(end-start+1)>LongestPalin.length())
                {
                    LongestPalin=s.substring(start,end+1);
                }
                end=s.indexOf(s.charAt(start),end+1);
            }
        }
        System.out.println(LongestPalin.length());
        System.out.println(LongestPalin);

    }
    static boolean checkPalin(String s) {
        String rev = "";
        for (int i = 0; i < s.length(); i++)
        {
            rev=s.charAt(i)+rev;
        }
        return s.equals(rev);

    }}
