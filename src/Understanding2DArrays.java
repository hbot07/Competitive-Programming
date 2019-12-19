import java.util.Scanner;

public class Understanding2DArrays {
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        int a[][]=new int[2][3];
        //input 2d array
        for(int r=0;r<2;r++)
        {
            for(int c=0;c<3;c++)
            {
                System.out.println("Enter element at row "+(r+1)+" and column "+(c+1));
                a[r][c]=sc.nextInt();
            }
        }
//print 2d array
        for(int r=0;r<2;r++)
        {
            for(int c=0;c<3;c++)
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println("");
        }

    }
}
