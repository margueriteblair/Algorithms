public class MergeLinkedLists {
    public static void main(String[] args) {
        
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
                   return null;
               }
               
               if(l1 == null){
                   return l2;
               }
               
               if(l2 == null){
                   return l1;
               }
               
               ListNode result = new ListNode(-1);
               ListNode back = result;
               
               while(l1 != null && l2 != null){
                   
                   if(l1.val>l2.val){
                       result.next = new ListNode(l2.val);
                       l2 = l2.next;
                   }
                   else{
                       result.next = new ListNode(l1.val);
                       l1 = l1.next;
                   }
                   result = result.next;
               }
                  
                   while(l1 != null){
                       result.next = new ListNode(l1.val);
                       l1 = l1.next;
                       result = result.next;
                   }
               
                while(l2 != null){
                       result.next = new ListNode(l2.val);
                       l2 = l2.next;
                       result = result.next;
                   }
               return back.next;
           }
}