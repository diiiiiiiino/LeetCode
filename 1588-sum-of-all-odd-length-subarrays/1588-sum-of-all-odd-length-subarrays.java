class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j + i <= arr.length; j += 2){
                for(int k = i, l = 0; l < j; l++, k++){
                    sum += arr[k];
                }
            }
        }

        return sum;
    }
}