class Solution {
    public int splitNum(int num) {
        int[] nums = Arrays.stream(String.valueOf(num).split(""))
        .mapToInt(Integer::parseInt)
        .toArray();

        Arrays.sort(nums);

        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            int digit = nums[i];
            if(i % 2 == 0){
                even.append(digit);
            } else {
                odd.append(digit);
            }
        }
        
        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString()); 
    }
}