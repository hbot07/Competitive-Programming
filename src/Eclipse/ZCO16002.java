import java.util.Scanner;
public class ZCO16002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar1=new int[(int)(Math.pow(10, 5)+1)];
        int[] ar2=new int[n];
        for(int i=0;i<n;i++)
        {
        	ar2[i]=sc.nextInt();
        	
        }
        for(int i=0;i<n-1;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		ar1[Math.abs(ar2[i]-ar2[j])]++;
        	}
        }
        int a=0;
        for(int i=0;i<ar1.length;i++)
        {
        if(ar1[i]>a)
        	a=ar1[i];
        }
        System.out.println(a+1);

	}

}
