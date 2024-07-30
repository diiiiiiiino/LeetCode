class Solution {
    private static final String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for(String w : words){
            StringBuilder sb = new StringBuilder();
            for(char ch : w.toCharArray()){
                sb.append(morse[ch - 'a']);
            }

            set.add(sb.toString());
            
            
        }

        return set.size();
    }
}