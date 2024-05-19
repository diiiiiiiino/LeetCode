class Solution {
    public boolean divisorGame(int n) {
        boolean isMove = false;
        int x = 1;
        while(0 < x && x < n){
            if(n % x == 0){
                n = n - x;
                x = 1;
                isMove = !isMove;
            } else {
                x++;
            }
        }
        
        return isMove;
    }
}