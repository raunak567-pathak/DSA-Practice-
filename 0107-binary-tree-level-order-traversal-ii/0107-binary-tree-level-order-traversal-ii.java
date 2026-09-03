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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        LinkedList<List<Integer>> list = new LinkedList<>();

        if(root == null)return list;

        q.offer(root);

        while(!q.isEmpty()){
            int n = q.size();

            List<Integer> res =new ArrayList<>();

            for(int i = 0 ; i < n ; i++){
                TreeNode node = q.poll();
                res.add(node.val);

                if(node.left != null)q.offer(node.left);
                if(node.right != null)q.offer(node.right);
            }
            list.addFirst(res);
        }
        return list ; 
    }
}