class Solution {
    public boolean squareIsWhite(String coordinates) {
        int sum = 0;
        for(char ch : coordinates.toCharArray()){
            sum += ch;
        }

        return sum % 2 != 0;
    }
}