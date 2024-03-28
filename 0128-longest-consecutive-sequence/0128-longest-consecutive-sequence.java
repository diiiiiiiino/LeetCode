class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) 
            return 0;
        
        Arrays.sort(nums);

        int answer = 1;
        int count = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]) continue;
            if(nums[i] + 1 != nums[i + 1]) {
                count = 1;
                continue;
            }

            count++;
            answer = Math.max(answer, count);
        }

        return answer;
    }
}