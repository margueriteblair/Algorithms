import java.util.LinkedList;
import java.util.Queue;

public class BFSJava {
    private int V; //number of nodes in the graph
    private LinkedList<Integer> adj[]; //adjacent tracking, it's an array of LinkedLists
    private Queue<Integer> queue;

    BFSJava(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int n) {
        boolean nodes[] = new boolean[V];
        int a = 0;

        nodes[n] = true;
        queue.add(n); //adding the root node to the top of the queue

        while (queue.size() != 0) {
            n = queue.poll();
            System.out.println(n + " ");
        }
    }
}