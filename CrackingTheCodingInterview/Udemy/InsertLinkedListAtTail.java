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
        while (head != null) {
            head = head.next;
        }
        
        head = new Node(data);
        return head;
    }

    public static  Node insert2(Node head,int data) {
        Node newhead = new Node(data);
        if(head != null) {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newhead;
            return head;
        } else {
            return newhead;
        }
  }
}

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}