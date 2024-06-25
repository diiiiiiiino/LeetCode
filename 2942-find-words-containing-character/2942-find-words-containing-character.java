class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int start = 0;
        int end = 0;

        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String word = words[i];

            if(word.indexOf(x) != -1){
                answer.add(i);
            }
            
        }

        return answer;
    }
}