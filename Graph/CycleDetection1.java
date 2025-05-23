import java.util.ArrayList;

public class CycleDetection1 {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src =  s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));


        // 1 vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        // 3 vertex
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        // 4 vertex
        graph[4].add(new Edge(4, 3));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for(int i = 0 ; i<graph.length ; i++) {
            if(!vis[i]) {
                if(detectCycleUtil(graph, vis, i, -1)) {
                return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
        vis[curr] = true;

        for(int i = 0 ; i<graph[curr].size() ; i++) {
            Edge e = graph[curr].get(i);

            // case 3
            if(!vis[e.dest]) {
                if(detectCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
               }
            }

            // case1
            else if (vis[e.dest] && e.dest != par) {
                return true;
            }

            // case2 
            // do nothing -> continue
        }
        
        return false;
    }

    public static void main(String[] args) {

        // Below all line is correct :)

        // int v =  5 ;
        // ArrayList<Edge> graph[] = new ArrayList[v];
        // createGraph(graph);

        // System.out.println(detectCycle(graph));

    }
}
