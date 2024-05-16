class Solution {
    public int alternateDigitSum(int n) {
        int answer = 0;
        boolean isNegative = false;

        Stack<Integer> stk = new Stack<>();
        while(n != 0){
            int rest = n % 10;
            stk.push(rest);

            n /= 10;
        }

        while(!stk.isEmpty()){
            answer += stk.pop() * (isNegative ? -1 : 1);
            isNegative = !isNegative;
        }

        return answer;
    }
}