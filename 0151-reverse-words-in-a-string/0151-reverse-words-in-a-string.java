class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        Stack<String> stk = new Stack<>();

        for(char ch : s.toCharArray()){
            if(Character.isWhitespace(ch)){
                if(sb.length() > 0){
                    stk.push(sb.toString());
                    sb.delete(0, sb.length());
                }
            } else {
                sb.append(String.valueOf(ch));
            }
        }

        stk.push(sb.toString());

        sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());

            if(!stk.isEmpty()){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}