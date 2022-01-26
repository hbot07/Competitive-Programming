import java.util.Arrays;
import java.util.Scanner;

public class SareejaAndMugs {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int n=sc.nextInt(), s=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int sum=0, i=0;
        for(i=0; i<n; i++){
            sum+=a[i];
            if(sum>s)
                break;
        }
        if(i>=n-1)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
