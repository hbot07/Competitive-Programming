import java.util.Scanner;

public class RodCuttingDP {
    static int[] priceList,memo;
    static boolean[] isAlreadyCalculated;
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {

        int n=sc.nextInt();
        priceList=new int[n];memo=new int[n];
        isAlreadyCalculated=new boolean[n];
        for(int i=0;i<n;i++)
        {
            priceList[i]=sc.nextInt();

        }

        System.out.println(r(n));

    }
    static int r(int n)
    {if(n==1) return priceList[0];
        if(n==0) return 0;
        if (isAlreadyCalculated[n-1]) return memo[n-1];
        int max=priceList[n-1];//the revenue when no cut would be made
        for(int i=1;i<n;i++)
        {
            max=Math.max(r(i)+r(n-i),max);
        }
        memo[n-1]=max;isAlreadyCalculated[n-1]=true;
        return max;
    }
}
