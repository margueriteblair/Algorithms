package CrackingTheCodingInterview.Udemy;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        stack.push(curr.val);
        while (curr.next != null) {
            curr = curr.next;
            stack.push(curr.val);
        }
        System.out.println(stack);
        
        
        ListNode newHead = new ListNode(stack.pop());
        ListNode copy = newHead;
        while (!stack.isEmpty()) {
            copy.next = new ListNode(stack.pop());
            copy = copy.next;
        }
        return newHead;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
  
}