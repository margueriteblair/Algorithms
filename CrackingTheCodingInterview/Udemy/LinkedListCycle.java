package CrackingTheCodingInterview.Udemy;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {
    public static void main(String[] args) {
        
    }
    public ListNode detectCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode curr = head;
        while (curr.next != null) {
            if (list.contains(curr)) {
                return curr;
            }
            list.add(curr);
            curr = curr.next;
        }
        return curr;
    }
}

class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
            val = x;
            next = null;
            //comment
    }}