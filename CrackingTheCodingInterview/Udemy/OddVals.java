ListNode<Integer> solution(ListNode<Integer> head) {
    int count = 0;
    ListNode<Integer> copy = head;
    ListNode<Integer> prev = null;
    while (copy != null) {
        if (count % 2 == 1) {
            prev.next = copy.next;
        } else {
            prev = copy;
            copy=copy.next;
        }
        count++;
        
    }
    return head;
}