class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int answer = -1;
        int count = 1;
        int current = nums[0];
        int num = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(current == nums[i]){
                count++;
            } else {
                count = 1;
                current = nums[i];
            }

            if(answer < count){
                answer = count;
                num = current;
            }
        }

        return num;
    }
}