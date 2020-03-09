import java.util.Scanner;

public class CHPINTU {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
        int n=sc.nextInt();
        int m=sc.nextInt();
        int f[]=new int[n];
        boolean b[]=new boolean[m];
        for(int j=0;j<n;j++){
            f[j]=sc.nextInt()-1;
            b[f[j]]=true;
        }
        int costs[]=new int[m];
        for(int j=0;j<n;j++)
        {
            costs[f[j]]+=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            if(b[j] && costs[j]<min)
                min=costs[j];}
        System.out.println(min);
        }
    }
}
