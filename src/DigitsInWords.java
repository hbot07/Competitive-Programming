import java.util.Scanner;
public class DigitsInWords {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); String rev="";
        while(n>0)
        {
            rev=digitToString(n%10)+" "+rev;
            n/=10;
        }
        System.out.println(rev);
    }

    static String digitToString(int a)
    {
        String words[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        return words[a];
    }
}
