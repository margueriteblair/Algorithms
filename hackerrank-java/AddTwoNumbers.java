public class AddTwoNumbers {
    public static void main(String[] args) {
        
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        
        String str1 = "";
        String str2 = "";
        
        while (!stack1.isEmpty()) {
            str1 += stack1.pop();
        }
        
        while (!stack2.isEmpty()) {
            str2 += stack2.pop();
        }
        
        
        int sumInt = Integer.parseInt(str1) + Integer.parseInt(str2);
        String sumStr = String.valueOf(sumInt);
        
        ListNode head = new ListNode(Character.getNumericValue(sumStr.charAt(sumStr.length()-1)));
        ListNode copy = head.next;
        
        System.out.println(sumStr);
        for (int i = sumStr.length()-2; i >= 0; i--) {
            copy = new ListNode(Character.getNumericValue(sumStr.charAt(i)));
            copy = copy.next;
        }
        
        return head;
    }
}