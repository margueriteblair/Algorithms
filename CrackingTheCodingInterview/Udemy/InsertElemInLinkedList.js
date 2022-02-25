function solution(head, target, value) {
    if (!head || head.value === target) {
        let newNode = new ListNode(value);
        newNode.next = head;
        return newNode;
    }
    let prev = null;
    let copy = head;
    //3 -> 1 -> 2 -> 5
    //      p   h
    //elem: 0, target 2
    while (copy != null) {
        if (copy.value === target) {
            prev.next = new ListNode(value);
            prev.next.next = copy;
            copy = copy.next;
        } else {
            prev = copy;
            copy= copy.next;
        }
    }
    return head;
}