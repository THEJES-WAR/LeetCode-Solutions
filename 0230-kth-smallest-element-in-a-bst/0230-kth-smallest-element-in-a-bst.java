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
    int c = 0;
    int count = 0;
    public void helper(TreeNode root,int k){
        if(root==null) return;
        helper(root.left,k);
        count++;
        if(count==k){
            c = root.val;
            return;
        }
        helper(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return c;
    }
}