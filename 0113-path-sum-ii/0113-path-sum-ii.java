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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>() ;
        List<Integer> res = new ArrayList<>() ;
        helper(root , targetSum , res , list);
        return list ;
    }

    void helper(TreeNode root , int targetSum , List<Integer> res , List<List<Integer>> list){
        if(root == null)return ;
        res.add(root.val);
        targetSum -= root.val ;

        if(root.left == null && root.right == null && targetSum == 0){
            list.add(new ArrayList<>(res));
        }
        helper(root.left , targetSum , res , list) ;
        helper(root.right , targetSum , res , list) ;
        res.remove(res.size() - 1 ) ;
    }
}