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
        if (head == null) {
            return null;
        }
        ListNode tortoise = head;
        ListNode hare = head;
        while (true) {
            tortoise = tortoise.next;
            hare = hare.next;
            if (hare == null || hare.next == null) {
                return null;
            } else {
                hare = hare.next;
            }
            if (tortoise.equals(hare)) {
                break;
            }
        }
        ListNode t2 = tortoise;
        ListNode h2 = head;
        while (h2 != t2) {
            t2 = t2.next;
            h2 = h2.next;
        }
        
        return h2;
    }
}

class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
            val = x;
            next = null;

    }}