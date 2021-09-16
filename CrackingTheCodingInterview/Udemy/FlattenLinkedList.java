package CrackingTheCodingInterview.Udemy;

public class FlattenLinkedList {
    public static void main(String[] args) {
        
    }

    public Node flatten(Node head) {
        Node currentNode = head;
        if (head == null) {
            return null;
        }
        while (currentNode != null) {
            if (currentNode.child == null) {
                currentNode = currentNode.next;
            } else {
                
            }
            
        }
    }
}