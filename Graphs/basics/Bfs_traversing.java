package Graphs.basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs_traversing {
    static class  Edge {
        int src;
        int dest;
        
        public Edge(int s, int d)
        {
            this.src = s;
            this.dest = d;
        }
    }

    public static void main(String[] args) {

        // graph
        //      6      4
        //     /      /
        //    0------1-----3
        //     \      | 
        //      5     2
        int v=7;

        ArrayList<Edge>[] graph = new ArrayList[v]; 
        createGraph(graph);

        traverseBFS(graph);

    }


    public static void createGraph(ArrayList<Edge>[] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();  //now list is empty
        }

        //0 vertex
        graph[0].add(new Edge(0, 5));
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 6));

        // 1 vertex
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));

        // 2 vertex
        graph[2].add(new Edge(2, 1));

        // 3 vertex
        graph[3].add(new Edge(3, 1));

        // 4 vertex
        graph[4].add(new Edge(4, 1));

        // 5 vertex
        graph[5].add(new Edge(5, 0));

        // 6 vertex
        graph[6].add(new Edge(6,0));
    }


    // traversing in BFS order

    public static void traverseBFS(ArrayList<Edge>[] graph)
    {
        Queue<Integer> q = new LinkedList<>();
        boolean visit[] = new boolean[graph.length];
        
        
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if(!visit[curr])
            {
                visit[curr]=true;
                System.out.println(curr);

                for(int i=0;i<graph[curr].size();i++)
                {
                    q.add(graph[curr].get(i).dest);
                }
            }
        }
    }
}
