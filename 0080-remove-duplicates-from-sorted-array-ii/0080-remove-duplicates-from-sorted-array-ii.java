class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 1);

        for(int i = 1; i < nums.length; i++){
            int count = map.getOrDefault(nums[i], 0) + 1; 
            if(count > 2) continue;

            nums[idx++] = nums[i];
            map.put(nums[i], count);
        }

        return idx;
    }
}