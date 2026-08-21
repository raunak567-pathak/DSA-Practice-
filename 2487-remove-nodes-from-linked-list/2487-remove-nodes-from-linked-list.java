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
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null)return head ;

        head = rev(head);

        ListNode curr = head ;
        ListNode prev = head ;

        while(curr != null && curr.next != null){
            if(curr.next.val < prev.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next ;
                prev = curr;
            }
        }
        return rev(head);
    }
    ListNode rev(ListNode head){

        ListNode prev = null , curr = head , temp ;

        while(curr != null){
            temp = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = temp;
        }
        return prev;
    }
}