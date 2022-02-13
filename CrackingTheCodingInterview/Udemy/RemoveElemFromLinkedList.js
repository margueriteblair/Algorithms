var removeElements = function(head, val) {
    while (head != null && head.val == val) {
        head = head.next;
    }
    if (head == null) return head;
    let copy = head;
    let prev = null;
    while (copy != null) {
        if (copy.val == val){
            prev.next = copy.next;
            copy = prev.next;
        } else {
            prev = copy;
            copy = copy.next;
        }
    }
    return head;
};