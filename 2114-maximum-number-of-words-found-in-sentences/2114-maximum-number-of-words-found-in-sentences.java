class Solution {
    public int mostWordsFound(String[] sentences) {
        int answer =  0;
        for(String s : sentences){
            answer = Math.max(answer, s.split(" ").length);
        }

        return answer;
    }
}