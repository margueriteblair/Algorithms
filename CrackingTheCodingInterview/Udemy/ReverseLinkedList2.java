package CrackingTheCodingInterview.Udemy;

public class ReverseLinkedList2 {
    public static void main(String[] args) {
        
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        int currentPos = 1;
        ListNode currentNode = head;
        ListNode start = head;
        while (currentPos < left) {
            start = currentNode;
            currentNode = currentNode.next;
            currentPos++;
        }
        
        ListNode newList = null;
        ListNode tail = currentNode;
        
        while (currentPos >= left && currentPos <= right) {
            ListNode next = currentNode.next;
            currentNode.next = newList;
            newList = currentNode;
            currentNode = next;
            currentPos++;
        }
        
        start.next = newList;
        tail.next = currentNode;
        
        if (left == 1) {
            return newList;
        }
        return head;
    }
}