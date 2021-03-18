public class IntersectionofTwoLinkedLists {
    public static void main(String[] args) {
        
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA.val == headB.val) {
            return headA;
        }
        
        ListNode a = headA;
        ListNode b = headB;
        
        
        while (a != null) {
            a = a.next;
            if (a == b && b != null) {
                return a;
            }
        }

        
        if (b.next != null) {
            return getIntersectionNode(headA, b.next);
        } else {
            return null;
        }
        
    }
}