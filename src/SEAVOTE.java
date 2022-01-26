import java.util.Scanner;

public class SEAVOTE {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        short numberOfTestCases=sc.nextShort();
        for(int iter=0; iter<numberOfTestCases; iter++){
            forEachCase();
        }
    }
    static void forEachCase(){
        int n=sc.nextInt();
        int[] b= new int[n];
        long arraysum=0;
        for(int iter=0; iter<n; iter++){
            b[iter]=sc.nextInt();
            arraysum+=b[iter];
        }
        
    }
}
