class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        
        if(idx == -1){
            return word;
        } else {
            String reverse = new StringBuilder(word.substring(0, idx + 1))
            .reverse()
            .toString();
            return reverse + word.substring(idx + 1, word.length());
        }
    }
}