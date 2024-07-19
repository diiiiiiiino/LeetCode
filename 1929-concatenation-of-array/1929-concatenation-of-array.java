class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len * 2];

        for(int i = 0; i < nums.length; i++){
            answer[i] = answer[len + i] = nums[i];
        }

        return answer;
    }
}