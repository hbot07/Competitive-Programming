import java.util.Arrays;
import java.util.Scanner;
public class maxrem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long ar[]=new long[n];
long max=0;
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextLong();
		
		    if(ar[i]>max)
		    max=ar[i];
		}
		Arrays.sort(ar);
		
	for(int i=n-1;i>=0;i--)
	{
	    if(max!=ar[i])
	    {
	        System.out.print(ar[i]);return;
	    }
	}
	System.out.println(max);
	    
	}

}
