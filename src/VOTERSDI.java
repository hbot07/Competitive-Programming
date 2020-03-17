import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VOTERSDI{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        int n=sc.nextInt()+sc.nextInt()+sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1] && !ar.contains(a[i]))
                ar.add(a[i]);
        }
        System.out.println(ar.size());
        for(int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));
    }
}