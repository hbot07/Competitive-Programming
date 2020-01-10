import java.util.ArrayList;
import java.util.Scanner;

public class LearningGraphs {
    static int n;
    static ArrayList<Integer> adjacencyList[];
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of vertices");
        n=sc.nextInt();
        adjacencyList=new ArrayList[n];
        for(int i=0;i<n;i++)
            adjacencyList[i]=new ArrayList<>(n);
        System.out.println("Enter no. of edges");
        int e=sc.nextInt();
        for(int i=0;i<e;i++)
        {   System.out.println("Enter pair");
            int a=sc.nextInt(),b=sc.nextInt();
            adjacencyList[a].add(b);
            adjacencyList[b].add(a);
        }
        System.out.println("Where to start");
        for(Integer i:allConnectedTo(sc.nextInt()))
        {
            System.out.println(i);
        }

    }
    static boolean isvisited[];
    static ArrayList<Integer> allConnectedTo(int a)
    {
        ArrayList<Integer> connected=new ArrayList<Integer>(n);
        isvisited=new boolean[n];
        for(int i=0;i<n;i++)
        {
            isvisited[i]=false;
        }
        dfs(a,connected);
        return connected;
    }

    static void dfs(int s,ArrayList<Integer> a)
    {   a.add(s);
        isvisited[s]=true;
        for(int i:adjacencyList[s])
        {
            if(!isvisited[i])
            {
            dfs(i,a);
            }        }
    }


}
