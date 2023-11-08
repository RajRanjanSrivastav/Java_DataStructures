package Graphs.basics;

import java.util.ArrayList;

public class Create_rep{

    static class Edge {
        int src;
        int weit;
        int dest;

        public Edge(int s, int w, int d) {
            this.src = s;
            this.weit = w;
            this.dest = d;
        }
    }

    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge>[] graph = new ArrayList[v];  //currently this is null
        
        for(int i=0;i<v;i++)
        {
            graph[i]=new ArrayList<>();  //now list is empty
        }

        //0 vertiex
        graph[0].add(new Edge(0, 5, 1));

        //1 vertex
        graph[1].add(new Edge(1, 3, 3));
        graph[1].add(new Edge(1, 1, 2));
        graph[1].add(new Edge(1, 5, 0));

        //2 vertex
        graph[2].add(new Edge(2, 2, 4));
        graph[2].add(new Edge(2, 1, 3));
        graph[2].add(new Edge(2, 1, 1));

        //3 vertex
        graph[3].add(new Edge(3,3,1));
        graph[3].add(new Edge(3,1,2));

        //4 vertex
        graph[4].add(new Edge(4, 2, 2));

        // 2's neighbour
        for(int i=0;i<graph[2].size();i++)
        {
            Edge e = graph[2].get(i); // this line give me edge in which src, weight, destination is present
            System.out.println(e.dest);
        }

    }
}
