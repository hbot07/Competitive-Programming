import java.util.Scanner;
// import java.math.BigInteger;

public class MARBLES {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int t=sc.nextInt();
        for(int i=0; i<t; i++){
            eachcase();
        }
    }
    static void eachcase(){
        int n=sc.nextInt(), k= sc.nextInt();
        System.out.println(nCr(n-1,k-1));
    }
    /*static long nCr(int n, int r){
        double product=1;
        long output=1;
        for(int i=r; i>=1; i--){
            product*=(n-r+i)/(double)i;

            if(product%1==0.0){
                output*=(long)product;
                product=1;
            }
        }
        return output;
    }*/
    /*static BigInteger nCr(int n, int r){
        BigInteger num=new BigInteger("1"), den=new BigInteger("1");
        for(int i=n; i>=n-r+1; i--){
            num=num.multiply(BigInteger.valueOf(i));
        }
        for(int i=r; i>1; i--){
            den=den.multiply(BigInteger.valueOf(i));
        }
        return num.divide(den);
    }*/
    static long nCr(int n, int r)
    {

        // p holds the value of n*(n-1)*(n-2)...,
        // k holds the value of r*(r-1)...
        long p = 1, k = 1;

        // C(n, r) == C(n, n-r),
        // choosing the smaller value
        if (n - r < r) {
            r = n - r;
        }

        if (r != 0) {
            while (r > 0) {
                p *= n;
                k *= r;

                // gcd of p, k
                long m = __gcd(p, k);

                // dividing by gcd, to simplify
                // product division by their gcd
                // saves from the overflow
                p /= m;
                k /= m;

                n--;
                r--;
            }

            // k should be simplified to 1
            // as C(n, r) is a natural number
            // (denominator should be 1 ) .
        }
        else {
            p = 1;
        }

        // if our approach is correct p = ans and k =1
        return p;
    }

    static long __gcd(long n1, long n2)
    {
        long gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {
            // Checks if i is factor of both integers
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
