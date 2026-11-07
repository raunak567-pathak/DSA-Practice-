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
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head ; 
        ListNode curr = dummy;

        while(head != null && head.next != null){

            ListNode slow = head  ;
            ListNode fast = head.next ;

            curr.next = fast ;
            slow.next = fast.next;
            fast.next = slow ;

            curr = slow ;
            head = slow.next ;
            
        }
        return dummy.next ;
    }
}