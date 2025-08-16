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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        boolean c = true;
        int prev = 0;
        q.add(root);
        while (!q.isEmpty()) {
            int level = q.size();
            prev = c == true ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i = 0; i < level; i++) {
                TreeNode curr = q.poll();
                if ((c && (curr.val % 2 == 0 || curr.val <= prev)) ||
                        (!c && (curr.val % 2 != 0 || curr.val >= prev))) {
                    return false;
                }
                prev = curr.val;
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            c = !c;
        }
        return true;
    }
}