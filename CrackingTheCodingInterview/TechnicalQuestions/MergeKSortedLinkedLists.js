var mergeKLists = function(lists) {
    let allNodes = [];
    for (let i = 0; i < lists.length; i++) {
        let curr = lists[i];
        while (curr) {
            allNodes.push(curr.val);
            curr = curr.next;
        }
    }
    
    allNodes.sort()
    let head = new ListNode(allNodes[0]);
    let curr = head;
    for (let i = 1; i < allNodes.length; i++) {
        curr.next = new ListNode(allNodes[i]);
        curr = curr.next;
    }
    return head;
};