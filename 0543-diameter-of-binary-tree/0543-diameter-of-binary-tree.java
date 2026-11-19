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
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root) ;
        return max ;
    }

    private int max = 0 ;
    private int helper(TreeNode root){
        if(root == null)return 0 ;
        int leftd = helper(root.left) ;
        int rightd = helper(root.right) ;

        int curr = leftd + rightd ;
        max = Math.max(max , curr );

        return 1 + Math.max(leftd , rightd) ;
    }
}