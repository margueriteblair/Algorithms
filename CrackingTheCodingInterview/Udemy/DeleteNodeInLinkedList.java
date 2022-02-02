public class DeleteNodeInLinkedList {
    public static void main(String[] args) {
        
    }

    public void deleteNode(ListNode node) {
        //not a tail node that's passed in
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}