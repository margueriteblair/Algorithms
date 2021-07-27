import graphAlgos.Node;

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
    }
}