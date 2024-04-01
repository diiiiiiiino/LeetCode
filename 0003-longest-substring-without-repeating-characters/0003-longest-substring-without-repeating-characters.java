class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strs = s.split("");

        int answer = 0;
        int start = 0;
        int end = 0;

        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            
            int idx = sb.indexOf(str);
            if(idx != -1){
                sb.delete(0, idx + 1);
            }

            sb.append(str);

            answer = Math.max(answer, sb.length());
        }
        
        return answer;
    }
}