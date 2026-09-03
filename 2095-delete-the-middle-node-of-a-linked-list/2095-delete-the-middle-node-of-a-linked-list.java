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
    public ListNode deleteMiddle(ListNode head) {
       if(head == null || head.next == null) {
        return null;
       }
      
       ListNode q1 =  head ;
       int count = 0 ;

       while(q1 != null){

        count++;
        q1 = q1.next ;
       }

       int mid = count / 2 ;

       ListNode temp = head ;

       int a = 0 ;

       while(a != mid - 1){
        temp = temp.next ;
        a++;
       }

       temp.next = temp.next.next ;
       return head ; 
    }
}