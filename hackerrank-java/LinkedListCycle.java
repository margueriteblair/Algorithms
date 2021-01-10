public class LinkedListCycle {
    public static void main(String[] args) {
        
    }

    boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node tortise = head;
        Node hare = head.next;
        
        while (hare.next != null && hare != null) {
            if (hare == tortise) {
                return true;
            }
            tortise = tortise.next; //tortise moves one node at a time
            hare = hare.next.next; //hare moves two nodes at a time
        }
        return false;
    }
}