/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        
        if(root == null)return 0 ;

        int max =  0 ;

        for(Node num : root.children){

            if(num != null){

                max = Math.max(max , maxDepth(num)) ;
            }
        }

        return max + 1 ;
    }
}