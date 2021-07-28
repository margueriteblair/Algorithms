package graphAlgos;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Node n0 = new Node(0); //all you pass into the node constructor is the int value;
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        //we make a bunch of loose nodes that arent connected initially
        //but now, we will use our add edge method to add edges to the nodes

        n0.addEdge(n1);
        n1.addEdge(n0);
        n1.addEdge(n3);
        n1.addEdge(n2);
        n2.addEdge(n1);
        n2.addEdge(n4);
        n3.addEdge(n1);
        n3.addEdge(n4);
        n3.addEdge(n5);
        n4.addEdge(n2);
        n4.addEdge(n3);
        n5.addEdge(n3);

        //traversal methods below:

        System.out.println("BFS Iterative:");
        bfs(n0);
        System.out.println();

        // System.out.println("DFS Iterative:");
        // dfs(n0);
        // System.out.println();

        // System.out.println("DFS Recursive:");
        // dfsRecursive(n0, new HashSet<Integer>());
    }

    public static void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(root);
        visited.add(root.value);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            System.out.println(currentNode.value);

            for (Node n : currentNode.neighbors) {
                if (!visited.contains(n.value)) {
                    queue.add(n);
                    visited.add(n.value);
                }
            }
        }
    }
}

