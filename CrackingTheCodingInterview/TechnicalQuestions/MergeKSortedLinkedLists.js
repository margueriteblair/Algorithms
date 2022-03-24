var mergeKLists = function(lists) {
    if (lists.length == 0) return null;
    let allNodes = [];
    for (let i = 0; i < lists.length; i++) {
        let curr = lists[i];
        if (lists[i] == null) continue;
        while (curr) {
            allNodes.push(curr.val);
            curr = curr.next;
        }
    }
    
    allNodes.sort(function(a, b) {return a - b});
    if (allNodes.length == 0) return null;
    let head = new ListNode(allNodes[0]);
    let curr = head;
    for (let i = 1; i < allNodes.length; i++) {
        curr.next = new ListNode(allNodes[i]);
        curr = curr.next;
    }
    return head;
};