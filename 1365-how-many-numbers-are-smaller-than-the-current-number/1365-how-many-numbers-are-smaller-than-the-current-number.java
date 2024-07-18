class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        int[] copyArr = Arrays.copyOf(nums, nums.length);

        Arrays.sort(copyArr);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < copyArr.length; i++){
            if(map.get(copyArr[i]) == null){
                map.put(copyArr[i], i);
            }
        }

        for(int i = 0; i < nums.length; i++){
            answer[i] = map.get(nums[i]);
        }

        return answer;
    }
}