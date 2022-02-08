function count(head) {
    let cnt = 1;
    if (head == null) return 0;
    if (head.next != null) {
      cnt = count(head.next)+1;
    }
    return cnt;
}

class ListNode {
    constructor(value = 0, next = null) {
        this.value = value
        this.next = next
    }
}