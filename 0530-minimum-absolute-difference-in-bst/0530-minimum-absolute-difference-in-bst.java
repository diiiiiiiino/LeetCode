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
    
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        traverse(root, list);

        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < list.size() - 1; i++){
            answer = Math.min(Math.abs(list.get(i) - list.get(i + 1)), answer);
        }

        return answer;
    }

    private void traverse(TreeNode node, List<Integer> list){
        if(node == null) return;
        
        traverse(node.left, list);
        list.add(node.val);
        traverse(node.right, list);        
    }
}