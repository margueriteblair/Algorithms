public class RemoveKthNode {
    public static void main(String[] args) {
        
    }

    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        // Write your code here.
            int i = 0;
            int j = 0;
            LinkedList copy = head;
            while (i < k) {
                copy = copy.next;
                i++;
            }
            LinkedList copy2 = head;
            while (copy != null) {
                copy = copy.next;
                copy2 = copy2.next;
                i++;
                j++;
            }
            if (copy2.next == null) {
                copy2 = null;
            // } else if (copy2.next.next == null) {
            // 		copy2.next.next = null;
            } else {
                    copy2.value = copy2.next.value;
                    copy2.next = copy2.next.next;
            }
    
            // System.out.println(copy2.value);
            // System.out.println(j);
      }

      public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode copy = head;
        int count = 0;
        while (copy != null && count <= n){
            count++;
            prev = copy;
            copy = copy.next;
        }
        prev.next = copy.next;
        System.out.println(prev.val);
        System.out.println(copy.val);
        return head;
    }
}