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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);
        dummy.next = head ;

        ListNode traverse = dummy;

        for ( int i = 1 ; i < left ; i++){
            traverse = traverse.next;
        }

        ListNode curr = traverse.next ;
        ListNode add = curr ;
        ListNode prev = null;

        for ( int i = 0 ; i < right - left + 1 ;i++){
            ListNode temp = curr.next;
            curr.next = prev ;
            prev = curr ;
            curr = temp;
        }

       traverse.next = prev ;
       add.next = curr ; 

       return dummy.next ;

        
    }
}