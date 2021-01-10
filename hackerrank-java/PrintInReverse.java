public class PrintInReverse {
    public static void main(String[] args) {
        
    }

    static void reversePrint(SinglyLinkedListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.data);
            head = head.next;
        }
        
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}