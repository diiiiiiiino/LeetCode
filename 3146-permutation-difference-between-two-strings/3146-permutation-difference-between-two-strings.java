class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] answer = new int[26];
        for(int i = 0; i < s.length(); i++){
            int ch = s.charAt(i) - 'a';
            answer[ch] = i;
        }

        for(int i = 0; i < t.length(); i++){
            int ch = t.charAt(i) - 'a';
            answer[ch] = Math.abs(answer[ch] - i);
        }

        return Arrays.stream(answer)
                     .sum();
    }
}