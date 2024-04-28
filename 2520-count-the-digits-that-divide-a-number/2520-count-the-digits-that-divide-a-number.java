class Solution {
    public int countDigits(int num) {
        int answer = 0;

        int n = num;
        while(num != 0){
            int rest = num % 10;
            if(n % rest == 0){
                answer++;
            }

            num /= 10;
        }

        return answer;
    }
}