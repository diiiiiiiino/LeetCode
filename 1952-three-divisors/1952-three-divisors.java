class Solution {
    public boolean isThree(int n) {
        int answer = 0;
        for(int k = 1; k <= n; k++){
            if(n % k == 0){
                answer++;
            }
        }

        return answer == 3;
    }
}