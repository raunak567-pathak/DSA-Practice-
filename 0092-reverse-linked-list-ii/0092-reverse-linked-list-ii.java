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
        
        if(head == null || head.next == null)return head ;

        ListNode dummy = new ListNode(0) ;
        dummy.next = head ;
        ListNode curr = dummy  ;

        for(int i = 0 ; i < left - 1 ; i++)
            curr = curr.next ;

            ListNode temp = curr.next ;

            for(int i = 0 ; i < right - left ; i++){

                ListNode res = temp.next ;
                temp.next = res.next ;
                res.next = curr.next ;
                curr.next = res ;

            }
            return dummy.next ;
    }
}