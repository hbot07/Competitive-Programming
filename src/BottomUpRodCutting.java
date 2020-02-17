import java.util.Scanner;
//Classical Dynamic Programming
public class BottomUpRodCutting {
    static int[] a;
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println(r(n));

    }

    static int r(int n) {
        int[] r = new int[n+1];
        //r[0] = 0;
        r[1] = a[0];
        int max;
        for (int j = 2; j <= n; j++) {
            max=a[j-1];
            for (int i = 1; i < j; i++) {
                max = Math.max(max, r[i] + r[j - i]);
            }
            r[j]=max;
        }
        return r[n];
    }
}