class Solution {
    public int subtractProductAndSum(int n) {
        
        int answer = 1;
        int sum = 0;
        while(n != 0){
            int rest = n % 10;
            
            answer *= rest;
            sum += rest;
            
            n /= 10;
        }
        
        return answer - sum;
    }
}