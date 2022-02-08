class ListNode {
    constructor(value = 0, next = null) {
        this.value = value
        this.next = next
    }
}

function arrayify(head) {
    let ptr = head
    var array = []
    while (ptr != null) {
        array.push(ptr.value)
        ptr = ptr.next
    }
    return array
}

function append(head, target) {
    if (head == null) return new ListNode(target);
    
    let node = head;
    while (node.next != null) {
      node = node.next;
    }
  
    node.next = new ListNode(target);
    
    return head;
}