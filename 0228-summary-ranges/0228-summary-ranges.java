class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();

        if(nums.length == 0){
            return answer;
        }
        
        int L = 0, R = 1;
        int l = L, r = L;
        while(L < nums.length && R < nums.length){
            int diff = R - L;

            if(nums[R] - nums[L] == diff){
                l = L;
                r = R;
                R++;
            } else {
                String str = l == r ? String.valueOf(nums[l]) : nums[l] + "->" + nums[r];
                answer.add(str);

                L = R;
            }
        }

        if(l < r){
            answer.add(nums[l] + "->" + nums[r]);
        } else if(l == r){
            answer.add(String.valueOf(nums[l]));
        }

        return answer;
    }
}