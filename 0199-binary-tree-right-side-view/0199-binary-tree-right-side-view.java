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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> u = new ArrayList<>();
        if(root==null) return u;
        q.add(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> y = new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode curr = q.poll();
                y.add(curr.val);
                if(curr.right!=null) q.add(curr.right);
                if(curr.left!=null) q.add(curr.left);
            }
            u.add(y.get(0));
        }
        return u;
    }
}