class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int r = 1;

        int answer = 0;

        while(i < prices.length - 1 && r < prices.length){
            if(prices[i] > prices[r]){
                i = r;
                r++;
            } else {
                answer = Math.max(prices[r] - prices[i], answer);
                r++;
            }
        }

        return answer;
    }
}