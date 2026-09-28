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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> l = new ArrayList<>();

        backtrack(l , root);
        return l ;
        
    }

    public void backtrack(List<Integer> l, TreeNode node ){
        if ( node == null){
            return ;
        }

      backtrack(l, node.left);   
    l.add(node.val);           
    backtrack(l, node.right);
    }
}