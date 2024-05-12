class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        
        int[] dy = new int[n + 1];

        dy[0] = 0;
        dy[1] = 1;

        for(int i = 2; i <= n; i++){
            dy[i] = dy[i-1] + dy[i-2];
        }

        return dy[n];
    }
}