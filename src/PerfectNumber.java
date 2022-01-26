import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        long an=0;
        for(int i=0; i<k; i++){
            an+=1;
            while(sumOfDigits(an)!=10){
                an+=1;
            }
        }
        System.out.println(an);
    }
    static int sumOfDigits(long x){
        int sum=0;
        while(x!=0){
            sum+=x%10;
            x/=10;
        }
        return sum;
    }
}
