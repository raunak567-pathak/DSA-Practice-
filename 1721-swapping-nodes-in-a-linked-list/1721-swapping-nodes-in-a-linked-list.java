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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode curr = head ;

        for(int i = 0 ; i < k - 1 ; i++){

            curr = curr.next ;
        }

        ListNode left = curr ;
        ListNode right = head ;

        while(curr.next  != null){
            curr = curr.next ;
            right = right.next ;
            
        }

        int temp = left.val  ;
        left.val = right.val ;
        right.val = temp;
        return head ;
    }
}