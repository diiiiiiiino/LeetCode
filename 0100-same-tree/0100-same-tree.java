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
    boolean answer = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q != null) ||
            (p != null && q == null)){
            return false;
        }

        if(p != null && q != null){
            traverse(p, q);
        }

        return answer;
    }

    private void traverse(TreeNode p, TreeNode q){
        if(p.val != q.val){
            answer = false;
            return;
        }

        if((p.left != null && q.left == null) ||
            (p.left == null && q.left != null) ||
            (p.right != null && q.right == null) ||
            (p.right == null && q.right != null)){
                answer = false;
                return;
        }

        if(p.left != null && q.left != null){
            traverse(p.left, q.left);
        }

        if(p.right != null && q.right != null){
            traverse(p.right, q.right);
        }
    }
}