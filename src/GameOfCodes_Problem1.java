import java.util.Arrays;
import java.util.Scanner;

public class GameOfCodes_Problem1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        A[] a=new A[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new A();
            a[i].index=i;
            a[i].city=sc.next();
            a[i].n=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i].index+1);
        }
    }
}
class A implements Comparable<A>{
    int index,n;
    String city;

    @Override
    public int compareTo(A a) {
        return this.city.compareTo(a.city)==0?-(this.n-a.n):this.city.compareTo(a.city);
    }
}
