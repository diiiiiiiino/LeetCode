class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] counts = new int[n + 1];

        for(int i = 0; i < n; i++){
            counts[nums[i]]++;
        }

        int answer = 0;
        for(int i = 0; i <= n; i++){
            if(counts[i] == 0){
                answer = i;
            }
        }

        return answer;
    }
}