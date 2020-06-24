import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;
//https://www.codechef.com/problems/RRCOPY
public class RRCOPY {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            oneCase();
        }
    }
    static void oneCase(){
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        Dictionary<Integer,Integer> d=new Hashtable<>();
        for(int i=0;i<n;i++){
            try{
                d.put(ar[i],d.get(ar[i]+1));
            }catch(Exception e){
                d.put(ar[i],1);
            }
        }
        System.out.println(d.size());
    }
}
