public class MergeLinkedLists {
    public static void main(String[] args) {
        
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode copy1 = l1;
        ListNode copy2 = l2;
        ListNode end = copy1.val <= copy2.val ? copy1 : copy2;
        copy1 = l1.next;
        copy2 = l2.next;
        while (copy1 != null && copy2 != null) {
            if (copy1.val >= copy2.val) {
                end.next = copy2;
                copy2 = copy2.next;
            } else {
                end.next = copy1;
                copy1 = copy1.next;
            }
        }
        return end;
    }
}