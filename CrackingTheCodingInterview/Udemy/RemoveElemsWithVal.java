public ListNode removeElements(ListNode head, int val) {
    while (head != null && head.val == val) {
        head = head.next;
    }
    
    if (head == null) return head;
    
    ListNode prev = null;
    ListNode copy = head;
    
    while (copy != null) {
        if (copy.val == val) {
            prev.next = copy.next;
            copy = copy.next;
        } else {
            prev = copy;
            copy = copy.next;
        }
    }
    return head;
}

public class ListNode {
    private int val;
    private ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}