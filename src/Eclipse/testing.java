import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
public class testing {static long startTime,endTime,totalTime;
	static Random random=new Random();
	public static void main(String args[]) {
long[] ar1= new long[100000];
Long ar2[]= new Long[100000];
ArrayList<Long> l=new ArrayList<Long>(100000);
long r;
for(int j=0;j<100;j++)
{
for(int i=0;i<100000;i++)
{   r=random.nextLong();
	ar1[i]=r;
	ar2[i]=new Long(r);
	l.add(r);
}

startTime = System.nanoTime();
Arrays.sort(ar1);
endTime   = System.nanoTime();
totalTime = endTime - startTime;
System.out.println("int : "+(totalTime/1000000));

startTime = System.nanoTime();
Arrays.sort(ar2);
endTime   = System.nanoTime();
totalTime = endTime - startTime;
System.out.println("Integer : "+(totalTime/1000000));

startTime = System.nanoTime();
l.sort(null);
endTime   = System.nanoTime();
totalTime = endTime - startTime;
System.out.println("ArrayList<integer> : "+(totalTime/1000000));
System.out.println("\n-------------------------------------------\n");
}}}
