class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int z = n * n;
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < n; i++){
            int max = 0;

            for(int j = 0; j < n; j++){
                max = Math.max(grid[i][j], max);

                if(grid[i][j] == 0){
                    z--;
                }
            }

            x += max;
        }

        for(int j = 0; j < n; j++){
            int max = 0;

            for(int i = 0; i < n; i++){
                max = Math.max(grid[i][j], max);
            }

            y += max;
        }

        return x + y + z;
    }
}