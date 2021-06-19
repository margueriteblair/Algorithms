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
    }
}