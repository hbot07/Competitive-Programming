import java.util.Scanner;
public class divgm {static Scanner sc=new Scanner(System.in);
public static void main(String args[])
{

byte t=sc.nextByte();	
for(int i=0;i<t;i++)
	{
		task();
	}
}
static void task()
{
int n=sc.nextInt();
long sum=0;
for(int i=0;i<n;i++)
{if(i%2==0)
	sum+=sc.nextLong();
else
	sum-=sc.nextLong();
	}
if(sum%4==0)
	System.out.print("Avnish");
else
	System.out.print("Bishal");
}
}
