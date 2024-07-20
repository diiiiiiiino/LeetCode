class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[nums.length];

        int[] arr1 = Arrays.copyOfRange(nums, 0, n);
        int[] arr2 = Arrays.copyOfRange(nums, n, 2 * n);

        int idx = 0;
        int i = 0;
        while(i < nums.length){
            answer[i++] = arr1[idx];
            answer[i++] = arr2[idx];
            idx++;
        }

        return answer;
    }
}