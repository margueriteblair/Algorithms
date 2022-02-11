ListNode<Integer> solution(int k) {
    int[] fib = new int[] {1, 1};
    if (k == 0) {
        return null;
    } else if (k == 1){
        return new ListNode<Integer>(1);
    } else if (k == 2) {
        ListNode<Integer> head = new ListNode(1);
        head.next = new ListNode(1);
    }
    
    ListNode<Integer> head = new ListNode(1);
    ListNode<Integer> copy = head;
    head.next = new ListNode(1);
    head = head.next;
    int i= 2;
    while (i < k) {
        head.next = new ListNode(fib[0] + fib[1]);
        head = head.next;
        fib[0] = fib[1];
        fib[1] = head.value;
        System.out.println(Arrays.toString(fib));
        i++;
    }
    return copy;
}