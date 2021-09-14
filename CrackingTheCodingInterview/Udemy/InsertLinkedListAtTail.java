package CrackingTheCodingInterview.Udemy;

public class InsertLinkedListAtTail {
    public static void main(String[] args) {
        
    }

    public static  Node insert(Node head,int data) {
        //Complete this method
        if (head == null) {
            return new Node(data);
        }
        
        Node current = head;
        while (current != null) {
            current = current.next;
        }
        
        current = new Node(data);
        return head;
    }
}