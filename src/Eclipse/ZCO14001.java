import java.util.Scanner;
public class ZCO14001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long h=sc.nextLong();
long ar[]=new long[n];
for(int i=0;i<n;i++)
{
	ar[i]=sc.nextLong();
	}

byte c=-1;
int n1=0;
boolean holding=false;
while(c!=0)
{
c=sc.nextByte();
switch(c)
{
case 1://move left
	if(n1!=0) n1--;
	break;
case 2://move right
	if(n1!=n-1) n1++;
	break;
case 3://pick
	if(holding==false && ar[n1]!=0) {holding=true;ar[n1]--;}
	break;
case 4://drop
	if(ar[n1]<h&&holding==true) {holding=false;ar[n1]++;}
	break;
case 0:break;
}
}
for(long x:ar) System.out.print(x+" ");	}

}
