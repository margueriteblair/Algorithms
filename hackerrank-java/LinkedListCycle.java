public class LinkedListCycle {
    public static void main(String[] args) {
        
    }

    boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        Node first = head;
        Node second = head.next;
        
        while (second.next != null && second != null) {
            if (first == second) {
                return true;
            }
            first = first.next;
            second=second.next.next;
        }
        
        return false;
    }
}