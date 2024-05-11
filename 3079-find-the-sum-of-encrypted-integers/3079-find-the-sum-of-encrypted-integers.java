class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];

            answer += encrypt(num);
        }

        return answer;
    }

    private int encrypt(int num){
        int max = 0;
        int count = 0;
        while(num != 0){
            int rest = num % 10;

            max = Math.max(max, rest);

            num /= 10;
            count++;
        }

        int sum = 0;
        for(int i = 0, j = 1; i < count; i++, j *= 10){
            sum += max * j;
        }

        return sum;
    }
}