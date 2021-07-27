import java.util.ArrayList;
import java.util.List;

public class Node {
    //first, we create a node object that contains a value and an array list of neighboring nodes
    int value;
    List<Node> neighbors;

    //constructor to instantiate
    public Node(int value) {
        this.value = value;
        neighbors = new ArrayList<>();
    }

    public void addEdge(Node to) {
        neighbors.add(to);
    }
    
}