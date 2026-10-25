/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeSet<Integer> list = new TreeSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        inorder(root);
        list.pollFirst() ;
        if(list.size() > 0 ){
            return list.first();
        }
        return -1 ;
    }
    void inorder(TreeNode root){

        if(root == null)return ;

        if(root.left != null)inorder(root.left) ;
        list.add(root.val);
        if(root.right != null)inorder(root.right) ;
    }
}