class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, (s1, s2) -> s1.length() - s2.length());

        System.out.println(Arrays.toString(strs));

        String str = strs[0];

        String answer = "";
        for(int i = 0; i < str.length(); i++){
            String s = str.substring(0, i + 1);
            int count = 1;
            for(int j = 1; j < strs.length; j++){
                if(strs[j].startsWith(s)){
                    count++;
                }
            }

            if(count == strs.length){
                if(answer.length() < s.length()){
                    answer = s;
                }
            }
        }

        return answer;
    }
}