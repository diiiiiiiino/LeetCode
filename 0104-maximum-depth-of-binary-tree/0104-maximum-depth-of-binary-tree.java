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
    int answer = 0;

    public int maxDepth(TreeNode root) {
        if(root != null){
            recFunc(root, 1);
        }

        return answer;
    }

    private void recFunc(TreeNode node, int depth){
        answer = Math.max(answer, depth);

        if(node.left != null) 
            recFunc(node.left, depth + 1);

        if(node.right != null) 
            recFunc(node.right, depth + 1);
    }
}