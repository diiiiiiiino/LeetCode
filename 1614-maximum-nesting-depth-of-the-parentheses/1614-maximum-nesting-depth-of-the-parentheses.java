class Solution {
    public int maxDepth(String s) {
        Stack<Character> stk = new Stack<>();
        
        int answer = 0;
        int depth = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stk.push(ch);
                depth++;
            } else if(ch == ')') {
                stk.pop();
                depth--;
            }

            answer = Math.max(answer, depth);
        }

        return answer;
    }
}