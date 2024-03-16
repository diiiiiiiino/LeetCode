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
    public boolean isSymmetric(TreeNode root) {
        traverse(root.left, root.right);
        return answer;
    }

    private void traverse(TreeNode left, TreeNode right){
        if((left != null && right == null) ||
            (left == null && right != null)){
                answer = false;
            return;
        }
        
        if(left == null && right == null){
            return;
        }

        if(left.val != right.val){
            answer = false;
            return;
        }
        traverse(left.left, right.right);
        traverse(left.right, right.left);
    }
}