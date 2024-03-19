class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int answer = 0;

        while(l < r){
            if(height[l] < height[r]){
                answer = Math.max(answer, height[l] * (r - l));
                
                l++;
            } else {
                answer = Math.max(answer, height[r] * (r - l));

                r--;
            }
        }

        return answer;
    }
}