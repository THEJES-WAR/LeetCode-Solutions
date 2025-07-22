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
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> x = new ArrayList<>();
        if(root==null) return x;
        q.add(root);
        while(!q.isEmpty()){
            int l = q.size(),max =  Integer.MIN_VALUE;
            for(int i = 0;i<l;i++){
                TreeNode curr = q.poll();
                if(curr.val>max) max = curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            x.add(max);
        }
        return x;
    }
}