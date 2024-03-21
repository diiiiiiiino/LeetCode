class Solution {
    public int rob(int[] nums) {
        int answer = 0;
        int[] dy = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            dy[i] = Math.max(dy[i], nums[i]);
            
            for(int j = i + 2; j < nums.length; j++){
                dy[j] = Math.max(dy[i] + nums[j], dy[j]); 
                answer = Math.max(dy[j], answer);
            }

            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }
}