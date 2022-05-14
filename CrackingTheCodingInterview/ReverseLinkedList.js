function reverseLinkedList(head) {
    // Write your code here.
      //1->2->3->4
      //prev
      let prev = null;
      while (head) {
          let next = head.next;
          head.next = prev;
          prev = head;
          head = next;
      }
      return prev;
  }