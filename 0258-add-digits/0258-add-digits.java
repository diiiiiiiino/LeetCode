class Solution {
    public int addDigits(int num) {        
        while(num >= 10){
            int sum = 0;
            while(num != 0){
                int rest = num % 10;
                num /= 10;
                sum += rest;
            }
            
            num = sum;
        }

        return num;
    }
}