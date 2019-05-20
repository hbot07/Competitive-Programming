import java.util.Arrays;
import java.util.Scanner;

public class ZCO13003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		long ar[]=new long[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextLong();
		}
		Arrays.sort(ar);
		int i=0,j=0;long freq=0;
		while(ar[j]<k)
		{j=i;
			while(ar[i]+ar[j]<k)
			{
				freq++;
				j++;
			}
			i++;
		}
		System.out.println(freq);

	}

}
