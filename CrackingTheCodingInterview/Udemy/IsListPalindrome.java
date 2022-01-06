public class IsListPalindrome {
    public static void main(String[] args) {
        
    }

    boolean solution(ListNode<Integer> l) {
        Stack<Integer> stack = new Stack<>();
        ListNode<Integer> copy = l;
        while (l != null) {
            stack.push(l.value);
            l = l.next;
        }
    
        while (copy != null) {
            if (!copy.value.equals(stack.pop())) {
                return false;
            }
            copy = copy.next;
        }
        return true;
    }
}