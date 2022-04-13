function ListNode(val, next = null, down = null) {
    this.val = val;
    this.next = next;
    this.down = null;
}

const flatten = (list) => {
    if(!list) return list;
  
    const prehead = new ListNode(null);
    let curr = prehead;
  
    const _dfs = (node) => {
      if(!node) return;
      curr.next = new ListNode(node.val);
      curr = curr.next;
  
      _dfs(node.down);
      _dfs(node.next);
    };
  
    _dfs(list);
  
    return prehead.next;
  };