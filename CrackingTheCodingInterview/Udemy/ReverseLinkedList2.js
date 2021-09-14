const reverseBetween = function(head, m, n) {
    let currentPos = 1
    let currentNode = head;
    let start = head;
    while (currentPos < m) {
        start = currentNode;
        currentNode = currentNode.next;
        currentPos++;
    }

    let newList = null;
    let tail = currentNode;

    while (currentPos >= m && currentPos <= n) {
        let next = currentNode.next;
        currentNode.next = newList;
        newList = currentNode;
        currentNode = next;
        currentPos++;
    }

    start.next = newList;
    tail.next = currentNode; //we append it all together
    if (m == 1) {
        return newList
    }
    return head;
}