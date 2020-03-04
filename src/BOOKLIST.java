import java.util.ArrayList;
import java.util.Scanner;

public class BOOKLIST {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int m=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>(m);
        for(int i=0;i<m;i++)
        {
            a.add(i,sc.nextInt());
        }
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(a.remove(sc.nextInt()-1));
        }
    }
}
