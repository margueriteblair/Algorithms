public class ReverseALinkedList {
    public static void main(String[] args) {
        
    }

    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode reversedHead;
        if (!stack.isEmpty()) {
            reversedHead = new ListNode(stack.pop());
        } else {
            reversedHead = new ListNode();
        }
        ListNode copy = reversedHead;
        while (!stack.isEmpty()) {
            int newNode = stack.pop();
            copy.next = new ListNode(newNode);
            copy = copy.next;
        }
        return reversedHead;
        
    }
}