
import java.util.Arrays;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	long k=sc.nextLong();
	
	long ar[]=new long[n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextLong();
	}
	
	Arrays.sort(ar);
	int freq=0;
	for(int i=0;i<n-1;i++)
	{
		int j=n-1;
		while(Math.abs(ar[i]-ar[j])>=k)
		{
			freq++;j--;
		}
	}
	System.out.println(freq);
	}

}
