import java.util.Scanner;
public class strch {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short t = sc.nextShort();
		for(int i=0;i<t;i++)
		{
			task();
		}

	}
	static void task()
	{int freq=0;
	int n=sc.nextInt();
	String s=sc.next();
	char ch=sc.next().charAt(0);
	if(s.indexOf(ch)>=0)
	{
	boolean flag=false;
	for(int i=0;i<n;i++)
	{ flag=false;
		for(int j=i;j<n;j++)
		{
			if(s.charAt(j)==ch)
				flag=true;
			if(flag)
			{
				freq++;
			}
		}
	}}
	else freq=0;
	System.out.println(freq);
	}

}
