class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        
        int num = 0;
        int originX = x;
        while(x > 0){
            int rest = x % 10;
            num = (num * 10) + rest;
            x = x / 10;
        }

        if(num != originX){
            return false;
        }

        return true;
    }
}