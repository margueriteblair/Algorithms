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

    static SinglyLinkedListNode insertNodeAtPosition2(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
                SinglyLinkedListNode nodeToInsert = new SinglyLinkedListNode(data);
            SinglyLinkedListNode head2 = llist;
            if (llist == null) {
                llist = nodeToInsert;
                return llist;
            }
            
            if (position == 0) {
                llist.next = llist;
                llist = nodeToInsert;
            }
            
            int i = 0;
            while (i < position - 1 && llist.next != null) {
                llist = llist.next;
                i++;
            }
            
            SinglyLinkedListNode node2Replace = llist.next;
            llist.next = nodeToInsert;
            llist = llist.next;
            llist.next = node2Replace;
            return head2;
    
        }
}