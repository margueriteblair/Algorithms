function count(head) {
    let count = 0;
    while (head != null) {
      count++;
      head = head.next;
    }
    return count;
}