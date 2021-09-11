package CrackingTheCodingInterview.Udemy;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        stack.push(head);
        while (head.next != null) {
            head = head.next;
            stack.push(head);
        }
        
        ListNode newHead = stack.pop();
        
        newHead.next = null;
        while (!stack.isEmpty()) {
            newHead.next = stack.pop();
            newHead.next = newHead.next.next;
        }
        return newHead;
    }
}