/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if ( head == null || head.next == null) return head;
        
        int count = 1 ;
        ListNode curr = head ;

        while ( curr.next != null ){
            count++;
            curr = curr.next ;
             
        }

        k  = k % count ; 
        if ( k ==0 ) return head;
        int v = count - k ;

        ListNode tail = curr ;
        curr = head ;

        for ( int i = 0 ; i < v - 1  ; i++){
            curr = curr.next;
        }

        ListNode newHead = curr.next;
        curr.next = null ;
        tail.next = head ;

        return newHead;
    }
}