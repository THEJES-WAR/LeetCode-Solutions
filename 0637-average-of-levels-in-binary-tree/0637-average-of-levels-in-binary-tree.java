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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> x = new ArrayList<>();
        if(root==null) return x;
        q.offer(root);
        while(!q.isEmpty()){
            double c=0;
            int l = q.size();
            List y = new ArrayList<>();
            for(int i=0;i<l;i++){
                TreeNode curr = q.poll();
                y.add(curr.val);
                c+=curr.val;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            x.add(y.size()==1 ? c : (double)(c/l));
        }
        return x;
    }
}