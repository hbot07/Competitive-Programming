import java.util.Arrays;

public class PerfectNumberHelper {
    public static void main(String args[]){
        long[] a=new long[10000];
        long an=0;
        for(int i=0;i <10000; i++){
            an+=1;
            while(sumOfDigits(an)!=10){
                an+=1;
            }
            a[i]=an;
        }
        System.out.println(Arrays.toString(a));
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
