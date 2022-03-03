import java.util.HashMap;
import java.util.Map;

public class LinkedListRandomPointer {
    public Node copyRandomList(Node head) {
        //base case
        if (head == null) return null;
        //hashmap where key is the old node and then the value is the new node to be cloned
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;
        map.put(curr, new Node(curr.val));
        
        while (curr != null) {
            //1. get the new node of the current pointer
            Node currClone = map.get(curr);
            
            //2. now build out the random pointer if it doesn't exist in the tabl
            if (curr.random != null && !map.containsKey(curr.random)){
                map.put(curr.random, new Node(curr.random.val));
            }
            Node randomClone = map.get(curr.random);
            currClone.random = randomClone;
            
            if (curr.next != null && !map.containsKey(curr.next)) {
                map.put(curr.next, new Node(curr.next.val));
            }
            
            Node nextClone = map.get(curr.next);
            currClone.next = nextClone;
            
            curr = curr.next;
        }
        return map.get(head);
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}