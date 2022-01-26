import java.util.Scanner;

public class LoveA {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        String s= sc.next();
        int sum=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                sum++;
            }
        }
        System.out.println(Math.min(sum*2-1, s.length()));
    }
}
