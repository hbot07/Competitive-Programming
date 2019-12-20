import java.util.Scanner;

public class FLOW013 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
            System.out.println(sc.nextInt()+sc.nextInt()+sc.nextInt()==180?"YES":"NO");
    }}
