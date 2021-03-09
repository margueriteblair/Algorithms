public class RemoveDuplicatesFromLinkedList {
    public static void main(String[] args) {
        
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        List<Integer> stack = new ArrayList<>();
        stack.add(head.val);
        head = head.next;
        while (head != null) {
            if (stack.get(stack.size()-1) != head.val) {
                stack.add(head.val);
            }
            head = head.next;
        }
        System.out.println(stack);
        ListNode node = new ListNode(stack.get(0));
        for (int i = 1; i < stack.size(); i++) {
            node.next = new ListNode(stack.get(i));
        }
        return node;
    }
}