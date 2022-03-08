class LinkedList {
    constructor(value) {
      this.value = value;
      this.next = null;
    }
  }
  
  function removeKthNodeFromEnd(head, k) {
    // Write your code here.
      let copy = head;
      let count = 1;
      while (count <= k) {
          count++;
          copy = copy.next;
      }
      
      if (copy === null) {
          head.value = head.next.value;
          head.next = head.next.next;
          return;
      }
      
      let copy2 = head;
      while (copy.next != null) {
          copy2 = copy2.next;
          copy = copy.next;
      }
      
      copy2.next = copy2.next.next;
      
  }