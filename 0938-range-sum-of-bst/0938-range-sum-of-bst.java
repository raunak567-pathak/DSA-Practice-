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
    int ans ;
    int l ;
    int h ;
    public int rangeSumBST(TreeNode root, int low, int high) {
    ans = 0 ;
    l = low ;
    h = high ;
    helper(root);
    return ans ;
    }
    private void helper(TreeNode root){

        if(root == null)return ;
        if(root.val >= l && root.val <= h)ans += root.val ;
        helper(root.left) ;
        helper(root.right) ;

    }
}