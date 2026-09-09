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
    public ListNode partition(ListNode head, int x) {

        if(head == null){
            return null ;
        }
   List<Integer> less = new ArrayList<>();
        List<Integer> great = new ArrayList<>();
        ListNode curr = head ;


        while(curr != null){
            if(curr.val < x){
                less.add(curr.val);
            }else{
                great.add(curr.val);
            }
            curr = curr.next ;
        }

        curr = head ;

        for(int val : less){
            curr.val = val ;
            curr = curr.next ;
        }
        for(int val : great){
            curr.val = val ;
            curr =  curr.next ;
        }
        return head ;
    }
}