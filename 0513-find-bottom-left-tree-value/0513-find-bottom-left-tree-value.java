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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> x = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> y = new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode curr = q.poll();
                y.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            x.add(y);
        }
        return x.get(x.size()-1).get(0);
    }
}