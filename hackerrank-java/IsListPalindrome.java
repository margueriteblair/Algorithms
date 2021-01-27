public class IsListPalindrome {
    public static void main(String[] args) {
        
    }

    boolean isListPalindrome(ListNode<Integer> l) {
        Stack<Long> stack = new Stack<>();
        ListNode<Integer> temp = l;
        while (l != null) {
            stack.add((long)l.value);
            l = l.next;
        }
        while (!stack.isEmpty()) {
            long test = stack.pop();
            if (test != temp.value) {
                System.out.println(test + " " + temp.value);
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}