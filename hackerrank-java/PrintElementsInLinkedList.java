static void printLinkedList(SinglyLinkedListNode head) {
    SinglyLinkedListNode start = head;
    while (start != null) {
        System.out.println(start.data);
        start = start.next;
    }

}