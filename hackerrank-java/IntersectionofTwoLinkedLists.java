public class IntersectionofTwoLinkedLists {
    public static void main(String[] args) {
        
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        
        if (a.val == b.val) {
            return a;
        }
        
        while (a != null) {
            a = a.next;
            if (a.val == b.val) {
                return a;
            }
        }
        
        if (b.next != null) {
            getIntersectionNode(headA, b.next);
        } else {
            return null;
        }
        
        return null;
    }
}