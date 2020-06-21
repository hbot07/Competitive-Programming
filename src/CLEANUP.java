//https://www.codechef.com/problems/CLEANUP
import java.util.Scanner;

public class CLEANUP {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int t =sc.nextInt();
        for(int i=0;i<t;i++){
            oneCase();
        }
    }
    static void oneCase(){
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean[] jobs=new boolean[n];
        for(int i=0;i<m;i++){
            jobs[sc.nextInt()-1]=true;
        }
        StringBuilder chef= new StringBuilder();
        StringBuilder assistant= new StringBuilder();
        boolean chefsTurn=true;
        for(int i=0;i<n;i++){
            if(!jobs[i]){
                if(chefsTurn){
                    chef.append(i + 1).append(" ");
                    chefsTurn=false;
                }
                else{
                    assistant.append(i + 1).append(" ");
                    chefsTurn=true;
                }
            }
        }
        System.out.println(chef);
        System.out.println(assistant);
    }
}
