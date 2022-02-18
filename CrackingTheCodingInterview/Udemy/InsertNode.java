ListNode<Integer> solution(ListNode<Integer> head, int target, int value) {
    
    ListNode<Integer> copy = head;
    ListNode<Integer> prev = null;
    if (target == head.value) {
        prev = new ListNode(value);
        prev.next = head;
        return prev;
    }
    while (copy != null) {
        if (copy.value == target) {
            prev.next = new ListNode<Integer>(value);
            prev.next.next = copy;
            break;
        } else {
            prev = copy;
            copy = copy.next;
        }

    }
    return head;
}