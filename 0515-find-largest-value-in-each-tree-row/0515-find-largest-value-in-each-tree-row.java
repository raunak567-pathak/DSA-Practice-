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
    public List<Integer> largestValues(TreeNode root) {
        if(root == null)return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()){

            int max = q.peek().val;

            for(int i = q.size() ; i > 0 ; i--){


                TreeNode node = q.poll();

                max = Math.max(max , node.val);

                if(node.left != null)q.offer(node.left);
                if(node.right != null)q.offer(node.right);
            }
            list.add(max);
        }
        return list;
    }
}