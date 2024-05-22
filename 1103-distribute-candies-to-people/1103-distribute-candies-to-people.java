class Solution {
    public int[] distributeCandies(int candies, int n) {
        int[] answer = new int[n];

        int idx = 0;
        int count = 1;
        while(candies >= 0){
            int add = 0;
            if(candies < count){
                add = candies;
            } else {
                add = count;
            }

            answer[idx] += add;

            candies -= count;
            count++;
            idx = (idx + 1) % n; 
        }

        return answer;
    }
}