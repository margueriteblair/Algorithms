public class InsertNodeInLinkedList {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null) {
            head = new SinglyLinkedListNode(data);
            return head;
        }
        SinglyLinkedListNode start = head;
        while (start != null) {
            start = start.next;
        }
        start = new SinglyLinkedListNode(data);
        return head;


    }
}