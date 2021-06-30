import java.util.Scanner;

public class CARVANS {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int t=sc.nextInt();
        for(int i=0; i<t; i++){
            eachcase();
        }
    }
    static void eachcase(){
        int n=sc.nextInt(), count=0;
        long front_speed=sc.nextLong(), back_speed=front_speed;
        for(int i=0;i<n-1;i++){
            front_speed=back_speed;
            back_speed=sc.nextLong();
            if(front_speed<back_speed){
                back_speed=front_speed;
                count++;
            }
        }
        System.out.println(n-count);
    }
}
