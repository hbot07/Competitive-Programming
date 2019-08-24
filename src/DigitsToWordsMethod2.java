import java.util.Scanner;
public class DigitsToWordsMethod2 {
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
    String num=sc.next();
    for(int i=0;i<num.length();i++)
    {
        System.out.print(convert(num.charAt(i))+" ");
    }

        }

static String convert(char c)
{
    String words[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    return words[c-'0'];
}

}
