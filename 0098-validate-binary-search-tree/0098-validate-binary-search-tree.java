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
    boolean flag = true;
    Stack<Integer> x = new Stack<>();
    public void helper(TreeNode root){
        if(root!=null){
            helper(root.left);
            if(!x.isEmpty() && x.peek()>=root.val){
                flag = false;
                return;
            }
            x.add(root.val);
            helper(root.right);
        }
    }
    public boolean isValidBST(TreeNode root) {
        helper(root);
        return flag;
    }
}