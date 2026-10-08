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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head ;

        while(curr != null){
            ListNode temp = curr.next ;

            while(temp != null && temp.val <= curr.val)
                temp = temp.next ;
                if(temp == null)
                list.add(0);
                else
                list.add(temp.val);

                curr = curr.next ;
            }
        int [] res = new int [list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            res[i] = list.get(i);
        }
        return res ;
    }
}