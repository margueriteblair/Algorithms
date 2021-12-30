package CrackingTheCodingInterview.Udemy;

public class ReverseLinkedList2 {
    public static void main(String[] args) {
        
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        int currPos = 1;
        ListNode currNode = head;
        ListNode start = head;
        while (currPos != left) {
            start = currNode;
            currNode = currNode.next;
            currPos++;
        }
        
        ListNode prev = null;
        ListNode tail = currNode;
        
        while (currPos >= left && currPos <= right) {
            ListNode next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
            currPos++;
        }
        
        start.next = prev;
        tail.next = currNode;
        
        if (left == 1) return prev;
        
        return head;
        
        
    }
}