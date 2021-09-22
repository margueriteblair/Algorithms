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

    public ListNode detectCycle2(ListNode head) {
        ListNode currentNode = head;
        ListNode tortoise = head;
        ListNode hare = head.next;
        while (hare != null) {
            if (tortoise == hare) {
                ListNode t2 = head;
                ListNode h2 = tortoise;
                while (t2 != h2) {
                    t2 = t2.next;
                    h2 = h2.next;
                }
                return h2;
            }
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        return null;
    }
}

class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
            val = x;
            next = null;

    }}