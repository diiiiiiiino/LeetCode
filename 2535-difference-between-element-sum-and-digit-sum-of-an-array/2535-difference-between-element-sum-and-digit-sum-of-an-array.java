class Solution {
    public int differenceOfSum(int[] nums) {
        int a = 0;
        int b = 0;

        for(int i = 0; i < nums.length; i++){
            a += nums[i];
            
            int n = nums[i];
            while(n != 0){
                int rest = n % 10;
                b += rest;
                
                n /= 10;
            }
        }

        return Math.abs(a - b);
    }
}