class Solution {
    public int countEven(int num) {
        if(num == 1){
            return 0;
        } else if(num == 2 || num == 3){
            return 1;
        }

        int[] nums = new int[num + 1];
        nums[0] = 0;
        nums[1] = 0;
        nums[2] = 1;
        nums[3] = 1;

        for(int i = 4; i < nums.length; i++){
            nums[i] = nums[i - 1] + count(i);
        }

        return nums[num];
    }

    private int count(int num){
        int sum = 0;
        while(num != 0){
            int rest = num % 10;
            sum += rest;

            num /= 10;
        }

        return sum % 2 == 0 ? 1 : 0;
    }
}