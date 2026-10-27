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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();

        if(root == null) return list ;

        Queue<TreeNode> q = new LinkedList<>() ;

        q.offer(root) ;

        int count = 0 ;

        while(!q.isEmpty()) {

            int n = q.size() ;

            count++ ; 

            List<Integer> res = new ArrayList<>() ;

            for(int i = 0 ; i < n ; i++){

                TreeNode node = q.poll() ;

                res.add(node.val) ;

                if(node.left != null)q.offer(node.left) ;
                if(node.right != null)q.offer(node.right) ;
            }

            if(count % 2 == 0 ){

                Collections.reverse(res);
            }
            list.add(res) ;
        }

        return list ;
    }
}