class Solution {
    public int[] runningSum(int[] nums) {
        int[] dy = new int[nums.length];
        dy[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            dy[i] = nums[i] + dy[i - 1];
        }

        return dy;
    }
}