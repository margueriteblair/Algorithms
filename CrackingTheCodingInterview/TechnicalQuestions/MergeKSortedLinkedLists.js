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

var mergeKLists2 = function (lists) {
    //helper function to merge 2 lists together
    var merge2Lists = (l1, l2) => {
      let dummy = new ListNode();
      let tail = dummy;
  
      while (l1!=null && l2!=null) {
        if (l1.val < l2.val) {
          tail.next = l1;
          l1 = l1.next;
        } else {
          tail.next = l2;
          l2 = l2.next;
        }
        tail = tail.next;
      }
      if (l1 != null) tail.next = l1;
      if (l2 != null) tail.next = l2;
      return dummy.next;
    };
  
    //edge case
    if (lists.length == 0) return null;
  
  //we say > 1 because we want to merge lists 2 by 2
    while (lists.length > 1) {
      let mergedLists = []
      //take the first 2 lists of the input lists then merge them using your helper function, store the result in the array you just created then push it in lists
      let l1 = lists.shift()
      let l2 = lists.shift()
      mergedLists = merge2Lists(l1,l2)
      lists.push(mergedLists)
    }
    return lists[0];
  };