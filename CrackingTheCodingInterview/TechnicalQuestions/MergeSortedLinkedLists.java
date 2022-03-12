package CrackingTheCodingInterview.TechnicalQuestions;

public class MergeSortedLinkedLists {
    public static void main(String[] args) {
        
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode copy = head;


        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                copy.next = list1;
                list1 = list1.next;
            } else {
                copy.next = list2;
                list2 = list2.next;
            }
            copy = copy.next;
        }
        
        while (list1 != null) {
            copy.next = list1;
            copy = copy.next;
            list1 = list1.next;
        }
        
        while (list2 != null) {
            copy.next = list2;
            copy = copy.next;
            list2 = list2.next;
        }
        return head.next;
    }
}