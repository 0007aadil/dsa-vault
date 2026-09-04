public class Solution {
    public ListNode detectCycle(ListNode head) {

        

        ListNode low = head;
        ListNode high = head ;

       
        

        while (  high != null && high.next != null ){

            low = low.next;
            high = high.next.next ;
            if ( high == low ){
              return  checkList(head, low);
            }


        }


        return null;
        
    }


    public ListNode checkList(ListNode high, ListNode low){

        while (high != low ){
            low = low.next;
            high = high.next;
            
        }

        return high ; 

    }



}