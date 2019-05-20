import java.util.Arrays;
import java.util.Scanner;
public class BookShelf {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		long b1[]=new long[n];
		long b2[]=new long[n];
		for(int i=0;i<n;i++)
		{
			b1[i]=sc.nextLong();
		}
		for(int i=0;i<n;i++)
		{
			b2[i]=sc.nextLong();
		}
		for(int i=0;i<k;i++)
		{
		if(max(b1)>max(b2))
		{
		swap(b1,b2,0,n-1);	
		}
		if(max(b1)<max(b2))
		{
			swap(b1,b2,n-1,0);	
		}
		else 	{
		System.out.println("bye");	
		}}
		System.out.println(max(b1)+max(b2));
		
	}
	
	static void swap(long a1[],long a2[],int a,int b)
	{
	 long temp=a1[a];
	 a1[a]=a2[b];
	 a2[b]=temp;
	}
	
	static long max(long ar[])
	{
		Arrays.sort(ar);
		return ar[ar.length-1];
	}

	static long min(long ar[])
	{
		Arrays.sort(ar);
		return ar[0];
	}
}
