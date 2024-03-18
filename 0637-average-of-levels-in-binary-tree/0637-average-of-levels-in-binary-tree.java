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
        List<List<Integer>> allLevels = new ArrayList<>();

        Queue<TreeNode> currentLevelOfNodes = new ArrayDeque<>();
        List<Integer> currentLevelOfElements = new ArrayList<>();

        currentLevelOfNodes.add(root);
        currentLevelOfElements.add(root.val);

        while(!currentLevelOfNodes.isEmpty()){
            Queue<TreeNode> previousLevelOfNodes = currentLevelOfNodes;

            allLevels.add(currentLevelOfElements);

            currentLevelOfNodes = new ArrayDeque<>();
            currentLevelOfElements = new ArrayList<>();

            for(TreeNode parent : previousLevelOfNodes){
                if(parent.left != null){
                    currentLevelOfNodes.add(parent.left);
                    currentLevelOfElements.add(parent.left.val);
                }

                if(parent.right != null){
                    currentLevelOfNodes.add(parent.right);
                    currentLevelOfElements.add(parent.right.val);
                }
            }
        }

        return allLevels.stream()
                .flatMap(list -> Stream.of(list.stream().mapToInt(Integer::valueOf).average().getAsDouble()))
                .collect(Collectors.toList());
    }
}