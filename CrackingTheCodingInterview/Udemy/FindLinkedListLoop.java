public class FindLinkedListLoop {
    public static void main(String[] args) {
        
    }

    public static LinkedList findLoop(LinkedList head) {
        // Write your code here.
            LinkedList tortoise = head;
            LinkedList hare = head;
            while (true) {
                tortoise = tortoise.next;
                    hare = hare.next;
        
                if(hare == null || hare.next == null) {
                    return null;
                } else {
                    hare = hare.next;
                }
        
                if(tortoise == hare) break;
            }
            
            LinkedList m1 = tortoise;
            LinkedList m2 = head;
    
            while (!m1.equals(m2)) {
                m1 = m1.next;
                m2 = m2.next;
            }
        return m2;
      }
}