import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class zSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] even= new long[n/2], odd= new long[(n+1)/2];
        int evenn=0, oddn=0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                odd[oddn]=sc.nextInt();
                oddn++;
            }
            else{
                even[evenn]=sc.nextInt();
                evenn++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(new long[][]{odd}, Collections.reverseOrder());
        evenn=0; oddn=0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                System.out.print(odd[oddn]+" ");
                oddn++;
            }
            else{
                System.out.print(even[evenn]+" ");
                evenn++;
            }
        }
    }
}
