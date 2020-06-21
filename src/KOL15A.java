import java.util.Scanner;

//https://www.codechef.com/problems/KOL15A
public class KOL15A {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
            oneCase();
    }
    static void oneCase(){
    String s=sc.next();
    int sum=0;
    for(char c: s.toCharArray()){
        if(Character.isDigit(c))
            sum+=Integer.parseInt(""+c);
    }
    System.out.println(sum);
    }
}