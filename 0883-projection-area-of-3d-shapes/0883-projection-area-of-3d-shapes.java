class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int z = 0;
        int x = 0;
        int y = 0;
        
        
        for(int i = 0; i < n; i++){
            int max = grid[i][0];

            for(int j = 1; j < n; j++){
                if(max < grid[i][j]){
                    max = grid[i][j];
                }
            }

            x += max;
        }

        for(int j = 0; j < n; j++){
            int max = grid[0][j];

            for(int i = 1; i < n; i++){
                if(max < grid[i][j]){
                    max = grid[i][j];
                }
            }

            y += max;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] > 0){
                    z++;
                }
            }
        }

        return x + y + z;
    }
}