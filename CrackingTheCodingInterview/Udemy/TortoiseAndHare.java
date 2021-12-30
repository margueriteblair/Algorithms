public class TortoiseAndHare {
    public static void main(String[] args) {
        
    }

    static boolean hasCycle(SinglyLinkedListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        SinglyLinkedListNode hare = head;
        SinglyLinkedListNode tortoise = head;
        
        while (hare != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
            
            if (hare == tortoise) {
                return true;
            }
        }
        return false;
    }
}