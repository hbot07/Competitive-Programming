import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sorting2DArrays {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns");
        int columns=sc.nextInt();
        int[][] array=new int[rows][columns];
        //Inputting elements to matrix
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.println("Please enter element at row "+(i+1)+" and column "+(j+1)+":");
                array[i][j]=sc.nextInt();
            }

        }
        System.out.println("Unsorted: ");
        print2DArray(array);
        System.out.println("Which column to sort according to?");
        sort2DArray(array,sc.nextInt()-1);
        System.out.println("Sorted: ");
        print2DArray(array);

    }
    static void print2DArray(int[][] array)
    {
        for(int[] a:array)
        {
            for(int i:a)
            {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
    static void sort2DArray(int[][] a,final int columns)
    {
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[columns]-t1[columns];
            }
        });
    }

}
//Sample output:
//Enter number of rows
//3
//Enter number of columns
//3
//Please enter element at row 1 and column 1:
//9
//Please enter element at row 1 and column 2:
//7
//Please enter element at row 1 and column 3:
//5
//Please enter element at row 2 and column 1:
//3
//Please enter element at row 2 and column 2:
//1
//Please enter element at row 2 and column 3:
//8
//Please enter element at row 3 and column 1:
//6
//Please enter element at row 3 and column 2:
//4
//Please enter element at row 3 and column 3:
//2
//Unsorted:
//9 7 5
//3 1 8
//6 4 2
//Which column to sort according to?
//3
//Sorted:
//6 4 2
//9 7 5
//3 1 8
//
//Process finished with exit code 0