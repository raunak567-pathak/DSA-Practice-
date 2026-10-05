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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        if(head == null)return head ;
        ListNode curr = head ;

        while(curr.next != null){
            int n1 = curr.val ;
            int n2 = curr.next.val ;

            int gc = gcd(n1 , n2);

            ListNode node = new ListNode(gc , curr.next);
            curr.next = node ;
            curr = node.next ;
        }
        return head ;
    }

    int gcd(int a , int b){
        if(b == 0)return a ;
        return gcd(b , a % b ) ;
    }
}