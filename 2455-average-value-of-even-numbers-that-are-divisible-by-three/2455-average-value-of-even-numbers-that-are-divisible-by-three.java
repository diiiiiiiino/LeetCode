class Solution {
    public int averageValue(int[] nums) {
        int answer = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            
            if(num % 6 == 0){
                answer += num;
                count++;
            }
        }

        return count == 0 ? count : answer / count;
    }
}