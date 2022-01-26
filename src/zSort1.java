import java.util.Arrays;
import java.util.Scanner;

public class zSort1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextLong();
        }
        Arrays.sort(a);
        long[] az=new long[n];
        for(int i=0, j=0; i<n; i++){
            if(i%2==0){
                az[i]=a[j];
            }
            else{
                az[i]=a[n-1-j];
                j++;
            }
        }
        boolean isZSorted=true;
        for(int i=1; i<n; i++){
            if(i%2==0){
                if(az[i]>az[i-1]){
                    isZSorted=false;
                    break;
                }
            }
            else{
                if(az[i]<az[i-1]){
                    isZSorted=false;
                    break;
                }
            }
        }
        if(isZSorted){
            for(int i=0; i<n; i++){
                System.out.print(az[i]+" ");
            }
        }
        else
            System.out.println("Impossible");
    }
}
