public class AddTwoNumbs {
    public static void main(String[] args) {
        System.out.println(10 % 9);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> sums = new Stack<>();
        while (l1 != null) {
            if (l2 == null) l2.val = 0;
            sums.push(l1.val + l2.val);
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while (l2 != null) {
            if (l1 == null) l1.val = 0;
            sums.push(l1.val + l2.val);
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode newHead = new ListNode(sums.pop());
        ListNode realHead = newHead;
        int recentRemainder = 0;
        while (!sums.isEmpty()) {
            int test = sums.pop();
            realHead.next = new ListNode((test + recentRemainder) % 10);
            if (test + recentRemainder > 9) {
                recentRemainder = test % 9;
                System.out.println(recentRemainder);
            } else {
                recentRemainder = 0;
            }
            realHead = realHead.next;
        }
        return newHead;
        
        
    }
}