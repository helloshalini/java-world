import java.util.*;

public class HasPath {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src =  s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 5));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 3));
        graph[1].add(new Edge(1, 3, 2));

        // 2 vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 5));

        // 3 vertex
        graph[3].add(new Edge(3, 2, 3));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 5, 1));

        // 4 vertex
        graph[4].add(new Edge(4, 2, 5));
        graph[4].add(new Edge(4, 3, 5));
        graph[4].add(new Edge(4, 5, 5));

        // 5 vertex
        graph[5].add(new Edge(5, 2, 3));
        graph[5].add(new Edge(5, 4, 3));
        graph[5].add(new Edge(5, 6, 3));

        graph[5].add(new Edge(6, 5, 3));

    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int scr, int dest, boolean vis[]) {
        if(scr == dest) {
            return true;
        }

        vis[scr] = true;
        for(int i = 0 ; i<graph[scr].size(); i++) {
            Edge e = graph[scr].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        // Below all the code is true 

        // int v = 7;
        // ArrayList<Edge>[] graph = new ArrayList[v];
        // createGraph(graph);
        // System.out.println(hasPath(graph, 0, 5, new boolean[v]));
        // System.out.println(hasPath(graph, 0, 9, new boolean[v]));

    }

}
