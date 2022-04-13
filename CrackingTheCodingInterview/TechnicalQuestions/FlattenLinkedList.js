function ListNode(val, next = null, down = null) {
    this.val = val;
    this.next = next;
    this.down = null;
}

const flatten = (list) => {
    //O(N) time, O(N) space
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

  const flatten2 = (list) => {
    if(!list) return list;
  
    let curr = list;
  
    while(curr) {
      if(curr.down){
        let downmost = curr.down;
        while(downmost && downmost.next) {
          downmost = downmost.next;
        }
      
        downmost.next = curr.next;
        curr.next = curr.down
        curr.down = null;
      }
      
      curr = curr.next;
    }
  
    return list;
  };