import java.util.ArrayList;
import java.util.Scanner;

public class MyFirstGraph {
    private static int numberOfVertices;
    private static ArrayList<Integer>[] adjacencyList;
    public static void main(String[] args)
    {
        System.out.println("This program prints all vertices connected to a given vertex in an undirected graph.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of vertices");
        numberOfVertices=sc.nextInt();
        adjacencyList=new ArrayList[numberOfVertices];
        for(int i=0;i<numberOfVertices;i++)
            adjacencyList[i]=new ArrayList<>(numberOfVertices);
        System.out.println("Enter number of edges");
        int numberOfEdges=sc.nextInt();
        for(int i=0;i<numberOfEdges;i++)
        {   
            System.out.println("Enter a pair of connected vertices");
            int vertex1=sc.nextInt(),vertex2=sc.nextInt();
            adjacencyList[vertex1].add(vertex2);
            adjacencyList[vertex2].add(vertex1);
        }
        System.out.println("Find connected vertices to which vertex?(Enter vertex number)");
        for(Integer i:allConnectedTo(sc.nextInt()))
        {
            System.out.println(i);
        }

    }
    private static boolean[] isVisited;
    static ArrayList<Integer> allConnectedTo(int vertex)
    {
        ArrayList<Integer> connected=new ArrayList<>(numberOfVertices);
        isVisited=new boolean[numberOfVertices];
        for(int i=0;i<numberOfVertices;i++)
        {
            isVisited[i]=false;
        }
        dfs(vertex,connected);
        return connected;
    }

    static void dfs(int vertex,ArrayList<Integer> connected)
    {   connected.add(vertex);
        isVisited[vertex]=true;
        for(int i:adjacencyList[vertex])
        {
            if(!isVisited[i])
            {
            dfs(i,connected);
            }        
        }
    }


}
