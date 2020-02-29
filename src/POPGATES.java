import java.util.Scanner;
import java.util.Stack;

public class POPGATES {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            oneCase();
        }
    }
    static void oneCase()
    {
        int n=sc.nextInt();
        int k=sc.nextInt();
        Stack<Boolean> st=new Stack<>();
        for(int i=0;i<n;i++)
            st.push(sc.next().equals("H"));
        for(int i=0;i<k;i++)
        {
            if(st.pop())
            {
                flip(st);
            }

        }
        int f=0;
        while(!st.isEmpty())
        {
            f+=st.pop()?1:0;
        }
        System.out.println(f);
    }
    static void flip(Stack<Boolean> st)
    {
        for(int i=0;i<st.size();i++)
        {
            st.set(i,!st.get(i));
        }
    }
}
