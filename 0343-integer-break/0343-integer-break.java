class Solution {
    public int integerBreak(int n) {
        if(n == 2) return 1;
        if(n == 3) return 2;

        int[] dy = new int[n + 1];
        dy[1] = 1;
        dy[2] = 2;
        dy[3] = 3;

        for(int i = 4; i <= n; i++){
            int max = 0;
            for(int j = 1; j <= i/2; j++){
                max = Math.max(max, dy[j] * dy[i - j]);
            }
            dy[i] = max;
        }

        return dy[n];
    }
}