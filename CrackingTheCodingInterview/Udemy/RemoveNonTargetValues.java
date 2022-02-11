package CrackingTheCodingInterview.Udemy;

public ListNode<Integer> solution(ListNode<Integer> list, int target) {
    while (list != null && list.value != target) {
        list = list.next;
    }
    if (list == null) return list;
    
    ListNode<Integer> prev = null;
    ListNode<Integer> copy = list;
    while (copy != null) {
        if (copy.value != target) {
            prev.next = copy.next;
            copy = prev.next;
        } else {
            prev = copy;
            copy = copy.next;  
        }
    }
    return list;
}class RemoveNonTargetValues {
    
}