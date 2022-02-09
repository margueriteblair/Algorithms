package CrackingTheCodingInterview.TechnicalQuestions;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        
    }

    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        int count = 0;
        while (head != null) {
            if (count % 2 == 1) {
                middle = middle.next;
            }
            head = head.next;
            count++;
        }
        return middle;
    }
}