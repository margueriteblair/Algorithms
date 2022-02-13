ListNode<Integer> solution(ListNode<Integer> head, int k) {
    ListNode<Integer> copy = head;
    ListNode<Integer> prev = null;
    int count = 0;
    while (copy!= null) {
        count++;
        if (count == k) {
            count = 0;
            prev.next = copy.next;
        }
        if (count != 0) {
            prev = copy;
        }
        copy=copy.next;
        
    }
    return head;
}