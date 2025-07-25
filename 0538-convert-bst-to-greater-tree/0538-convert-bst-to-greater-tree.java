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
    int c=0;
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.right);
        c+=root.val;
        root.val = c;
        helper(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        helper(root);
        return root;
    }
}