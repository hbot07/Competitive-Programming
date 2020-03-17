import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VOTERSDI {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int n1=sc.nextInt(),n2=sc.nextInt(),n3=sc.nextInt();
        ArrayList<Integer> a1=new ArrayList<>(n1),a2=new ArrayList<>(n2),a3=new ArrayList<>(n3);
        for(int i=0;i<n1;i++)
            a1.add(sc.nextInt());
        for(int i=0;i<n2;i++)
            a2.add(sc.nextInt());
        for(int i=0;i<n3;i++)
            a3.add(sc.nextInt());
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n1;i++)
        {
            if(a2.contains(a1.get(i)) || a3.contains(a1.get(i)))
            {
                a.add(a1.get(i));
                a2.remove(a1.get(i));
            }
        }
        for(int i=0;i<a2.size();i++){
            if(a3.contains(a2.get(i)))
            {
                a.add(a2.get(i));
            }
        }
        Collections.sort(a);
        System.out.println(a.size());
        for(int i=0;i<a.size();i++)
            System.out.println(a.get(i));
    }
}
