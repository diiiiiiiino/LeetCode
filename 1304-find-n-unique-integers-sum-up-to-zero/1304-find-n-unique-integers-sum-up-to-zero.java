class Solution {
    public int[] sumZero(int n) {
        int[] answer = new int[n];

        for(int i = 0; i < n; i++){
            answer[i] = i * 2 - n + 1;
        }

        return answer;
    }
}