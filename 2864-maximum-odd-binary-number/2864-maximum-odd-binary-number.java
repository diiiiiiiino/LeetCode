class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] chars1 = s.toCharArray();
        Arrays.sort(chars1);

        char[] chars = new char[s.length()];

        for(int i = 0; i < chars.length; i++){
            chars[i] = chars1[chars.length - i - 1];
        }

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                char temp = chars[i];
                chars[i] = chars[chars.length - 1];
                chars[chars.length - 1] = temp;
                break;
            }
        }
        return new String(chars);
    }
}