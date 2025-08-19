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
    TreeNode x ;
    public void helper(TreeNode root){
        if(root!=null){
            helper(root.left);
            TreeNode y = new TreeNode(root.val);
            x.right = y;
            x=x.right;
            helper(root.right);
        }
    }
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(0);
        x=dummy;
        helper(root);
        return dummy.right;
    }
}