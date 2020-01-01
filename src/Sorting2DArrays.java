import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sorting2DArrays {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();
        System.out.println("Enter number of columns");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }

        }
        System.out.println("Unsorted");
        print2DArray(arr);
        System.out.println("Which column to sort according to?");
        sort2Darray(arr,sc.nextInt());
        System.out.println("Sorted");
        print2DArray(arr);

    }
    static void print2DArray(int[][] arr)
    {
        for(int[] a:arr)
        {
            for(int i:a)
            {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
    static void sort2Darray(int[][] a,final int c)
    {
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[c]-t1[c];
            }
        });
    }

}
