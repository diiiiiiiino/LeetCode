class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            int idx = (i + k) % nums.length;
            nums[idx] = arr[i];
        }
    }
}