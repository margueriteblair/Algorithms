public class MergeLinkedLists {
    public static void main(String[] args) {
        
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode copy1 = l1;
        ListNode copy2 = l2;
        ListNode end = null;
        while (copy1 != null && copy2 != null) {
            if (copy1.val >= copy2.val) {
                end = copy2;
                copy2 = copy2.next;
            } else {
                end = copy1;
                copy1 = copy1.next;
            }
            end = end.next == null ? null : copy1;
        }
        return end;
    }
}