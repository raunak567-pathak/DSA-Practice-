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
    public boolean isUnivalTree(TreeNode root) {
        return helper(root , root.val);
    }

    boolean helper(TreeNode root , int s){

        if(root == null)return true ;

        if(root.val != s)return false;

        boolean l = helper(root.left , s) ;
        boolean r = helper(root.right , s);

        if(l == true && r == true )

        return l == r ;
        return false ;
    }
}