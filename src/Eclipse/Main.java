
import java.util.Scanner;
 class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		try{
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			task();
		}}
		catch(Exception e)
		{
		    
		}
	}
	
	static void task() throws Exception
	{
		int n=sc.nextInt();
		long[] l=new long[n];
		long[] u=new long[n];
		for(int i=0;i<n;i++)
		{
			l[i]=sc.nextLong();
			u[i]=sc.nextLong();
		}
		long[] p=new long[n];
		
		outer:for(int i=0;i<n-1;i++)
		{
			inner : for(int j=i+1;j<n;j++)
			{
				//i wins
				if((l[i]<=l[j]&&u[i]>=u[j])&&(l[i]<l[j]||u[i]>u[j]))
					{p[i]+=2;}
				//j wins
				else if((l[j]<=l[i]&&u[j]>=u[i])&&(l[j]<l[i]||u[j]>u[i]))
					{p[j]+=2;}
				//tie
				else
				{p[j]++;
				p[i]++;}
				
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(p[i]+" ");
		}
	}

}
