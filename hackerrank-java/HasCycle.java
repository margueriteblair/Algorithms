public class HasCycle {
    public static void main(String[] args) {
        
    }
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode tortoise = head;
        ListNode hare = head.next;
        
        try {
        while (hare != null) {
            if (hare == tortoise) {
                return true;
            }
            
            tortoise = tortoise.next;
            hare = hare.next.next;
        } 
        } catch (Exception ex) {
            return false;
        }

        return false;
    }
}