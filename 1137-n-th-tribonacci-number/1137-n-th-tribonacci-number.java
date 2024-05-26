class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        }

        int[] dy = new int[n + 1];
        dy[1] = 1;
        dy[2] = 1;

        for(int i = 3; i <= n; i++){
            dy[i] = dy[i - 3] + dy[i - 2] + dy[i - 1];
        }

        return dy[n];
    }
}