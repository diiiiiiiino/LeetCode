class Solution {
    public int[] distributeCandies(int candies, int n) {
        int[] answer = new int[n];

        int idx = 0;
        int count = 1;
        while(candies >= 0){
            answer[idx] += Math.min(candies, count);

            candies -= count;
            count++;
            idx = (idx + 1) % n; 
        }

        return answer;
    }
}