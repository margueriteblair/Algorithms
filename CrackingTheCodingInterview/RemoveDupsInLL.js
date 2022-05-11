class LinkedList {
    constructor(value) {
      this.value = value;
      this.next = null;
    }
  }
  
  function removeDuplicatesFromLinkedList(linkedList) {
    // Write your code here.
      if (!linkedList) return null;
      
      let curr = linkedList;
      while (curr.next) {
          console.log(curr.value === curr.next.value)
          if (curr.value === curr.next.value && curr.next.next !== null) {
              curr.next = curr.next.next;
          } else if (curr.value === curr.next.value && !curr.next.next) {
              curr.next = null;
              return linkedList;
          } else {
              curr = curr.next;
          }
      }
    return linkedList;
  }