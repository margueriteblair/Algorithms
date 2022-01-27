import java.util.*;
public class BFSGraph {
    public static void main(String[] args) {
        
    }

    public static List<Integer> traversalBFS(int[][] graph) {
        Queue<Integer> q = new LinkedList<Integer>
        List<Integer> vals = new ArrayList<>();
        Map<Integer, Boolean> map = new HashMap<>();
        while (q.size() != 0) {
            int vertex = q.pop();
            vals.add(vertex);
            map.put(vertex, true);
            int[] connections = graph[vertex];
            for (int i = 0; i < connections.length; i++) {
                int connection = connections[i];
                if (!map.get(connection)) {
                    q.add(connection);
                }
            }
        }
        return vals;
    }
}