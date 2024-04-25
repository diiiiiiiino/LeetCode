class Solution {
    public int numberOfMatches(int n) {
        int answer = 0;
        while(n != 1){
            boolean isOdd = n % 2 == 0;
            int matches = isOdd ? n / 2 : (n - 1) / 2;
            answer += matches;
            n = matches + (isOdd ? 0 : 1); 
        }

        return answer;
    }
}