//https://www.codechef.com/problems/LAYERS
import java.util.Scanner;

public class LAYERS {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        //System.out.println("reached here");
        for(int i=0;i<t;i++){
            oneCase();
        }
    }
    static void oneCase(){
        int n=sc.nextInt();
        int c=sc.nextInt();
        long[][] ar=new long[n][3];
        for(int i=0;i<n;i++){
            ar[i][0]=sc.nextLong()/2;
            ar[i][1]=sc.nextLong()/2;
            ar[i][2]=sc.nextInt();
        }
        long[] color=new long[c];
        long[] max=new long[2];
        for(int i=n;i>0;i--){
            if(ar[i-1][0]>max[0] && ar[i-1][1]>max[1]){
                color[(int)ar[i-1][2]-1]+=(ar[i-1][0]-max[0])*ar[i-1][1]
                        +(ar[i-1][1]-max[1])*ar[i-1][0]
                        -(ar[i-1][0]-max[0])*(ar[i-1][1]-max[1]);
                max[0]=ar[i-1][0];
                max[1]=ar[i-1][1];
            }
            else{
            if(ar[i-1][0]>max[0]){
                color[(int)ar[i-1][2]-1]+=(ar[i-1][0]-max[0])*ar[i-1][1];
                max[0]=ar[i-1][0];
            }
            if(ar[i-1][1]>max[1]){
                color[(int)ar[i-1][2]-1]+=(ar[i-1][1]-max[1])*ar[i-1][0];
                max[1]=ar[i-1][1];
            }
            }
        }
        for(int i=0;i<c;i++){
            System.out.println(color[i]*4);
        }
    }
}
