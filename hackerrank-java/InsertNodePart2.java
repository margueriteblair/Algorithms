public class InsertNodePart2 {
    public static void main(String[] args) {
        
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
            SinglyLinkedListNode trackedHeadNode = head;
            SinglyLinkedListNode nodeToInsert = new SinglyLinkedListNode(data);

            if (head==null){
                return nodeToInsert;
            }
            if (position == 0){
                nodeToInsert.next = head; return nodeToInsert;
            }    
            int i = 0;
            while (i < position -1 && head.next != null){
                head = head.next;        
                i++;       
            }
            SinglyLinkedListNode nodeAtPosition = head.next;
            head.next = nodeToInsert;
            head = head.next;
            head.next = nodeAtPosition;
            return trackedHeadNode;
        }
}