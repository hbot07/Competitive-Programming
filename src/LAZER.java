import java.util.Scanner;

public class LAZER {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
            oneCase();
    }
    static void oneCase()
    {
        int n=sc.nextInt(),q=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextLong();
        for(int i=0;i<q;i++)
        {
            int x1=sc.nextInt()-1,x2=sc.nextInt()-1;
            long y=sc.nextLong();
            int counter=0;
            for(int j=x1;j<x2;j++)
            {
                if(y>a[j] && (a[j+1]>y||a[j+1]==y)){
                    counter++;
                }
                else if(y<a[j] && (a[j+1]<y||a[j+1]==y)){
                    counter++;
                }
                else if(y==a[j]){
                    if(a[j+1]>y || a[j+1]<y){counter++;}
                    else if(a[j+1]==y){counter+=2;}
                }
            }
            System.out.println(counter);
        }
    }
}
