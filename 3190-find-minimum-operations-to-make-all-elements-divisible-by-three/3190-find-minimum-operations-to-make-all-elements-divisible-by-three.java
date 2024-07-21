class Solution {
    public int minimumOperations(int[] nums) {
        int answer = 0;
        for(int n : nums){
            if(n % 3 != 0){
                int sub = n - 1;
                int add = n + 1;

                if(sub % 3 == 0 || add % 3 == 0){
                    answer++;
                }
            }
        }

        return answer;
    }
}