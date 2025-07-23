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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int l = q.size();
            for(int i=0;i<l;i++){
                TreeNode curr = q.poll();
                if(curr.left!=null && flag == false) return false;
                else if(curr.left!=null) q.add(curr.left);
                else if(curr.left==null) flag=false;
                if(curr.right!=null && flag == false) return false;
                else if(curr.right!=null) q.add(curr.right);
                else if(curr.right==null) flag=false;
             }
        }
        return true;
    }
}