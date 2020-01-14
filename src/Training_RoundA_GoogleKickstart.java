import java.util.Arrays;
import java.util.Scanner;
//Practice 2019
public class Training_RoundA_GoogleKickstart {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            eachCase(i);
        }
    }
    static void eachCase(int testCaseNumber)
    {
        int n=sc.nextInt(),p=sc.nextInt();
        int[] s=new int[n];
        for(int i=0;i<n;i++)
            s[i]=sc.nextInt();
        Arrays.sort(s);
        long sum_of_p_elements=0;
        for(int i=0;i<p;i++)
            sum_of_p_elements+=s[i];
        int i=0;
        long answer=Long.MAX_VALUE;
        while(p+i<n)
        {
            int max=s[p+i-1];
            answer=Math.min(answer,p*max-sum_of_p_elements);
            sum_of_p_elements=sum_of_p_elements-s[i]+s[i+p];
            i++;
        }
        System.out.println("Case #"+(testCaseNumber+1)+": "+answer);
        }
}
