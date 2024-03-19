class Solution {
    public int jump(int[] nums) {
        int answer = 0;
        int idx = 0;
        int end = 0;
        for(int i = 0; i < nums.length - 1; i++){
            idx = Math.max(idx, nums[i] + i);

            if(idx >= nums.length - 1){
                answer++;
                break;
            }

            if(i == end){
                answer++;
                end = idx;
            }
        }

        return answer;
    }
}