class Solution {
    public int totalMoney(int n) {
        int m = n / 7;
        int rest = n % 7;

        int answer = 0;
        int i = 1;
        for(i = 1; i <= m; i++){
            for(int j = i; j < i + 7; j++){
                answer += j;
            }
        }

        for(int k = 1; k <= rest; k++){
            answer += i;
            i++;
        }

        return answer;
    }
}