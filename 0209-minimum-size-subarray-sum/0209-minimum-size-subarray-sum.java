class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int R = 0;
        int len = Integer.MAX_VALUE;

        int sum = 0;
        for(int L = 0; L < nums.length; L++){
            while(sum < target && R < nums.length){
                sum += nums[R];
                R++;
            }

            if(sum >= target){
                len = Math.min(len, R - L);
            }
            

            sum -= nums[L];
        }

        return len == Integer.MAX_VALUE ? 0 : len;
    }
}