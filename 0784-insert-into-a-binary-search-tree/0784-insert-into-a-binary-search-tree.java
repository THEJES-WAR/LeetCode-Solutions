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
    public void helper(TreeNode root,TreeNode v){
        if(root!=null){
            if(v.val>root.val){
                if(root.right==null){
                    root.right=v;
                }
                else helper(root.right,v);
            }
            else{
                if(root.left==null){
                    root.left=v;
                }
                else helper(root.left,v);
            }
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode v = new TreeNode(val);
        helper(root,v);
        return root;
    }
}