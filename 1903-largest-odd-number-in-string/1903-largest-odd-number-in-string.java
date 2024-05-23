class Solution {
    public String largestOddNumber(String num) {
        int l = 0, r = num.length() - 1;
        while(l <= r){
            int n = num.charAt(r) - '0';

            if(n % 2 == 0){
                r--;
            } else {
                return num.substring(l, r + 1);                
            }
        }

        return "";
    }
}