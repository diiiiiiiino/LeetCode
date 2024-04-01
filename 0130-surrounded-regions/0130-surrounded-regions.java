class Solution {
    private static final int[][] dirs = {{-1,0}, {0,1}, {0,-1}, {1,0}};

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] visited = new boolean[n][m];

        for(int x = 1; x < n - 1; x++){
            for(int y = 1; y < m - 1; y++){
                if(visited[x][y]) continue;
                if(board[x][y] == 'X') continue;

                boolean[][] isMarkable = new boolean[n][m];
                bfs(x, y, n, m, visited, isMarkable, board);
            }
        }    
    }

    private void bfs(int x, int y, int n, int m, boolean[][] visited, boolean[][] isMarkable, char[][] board){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y] = true;
        isMarkable[x][y] = true;

        boolean hasNonMarkerble = false;

        while(!q.isEmpty()){
            int[] arr = q.poll();
            int xx = arr[0];
            int yy = arr[1];

            for(int i = 0; i < dirs.length; i++){
                int nx = dirs[i][0] + xx;
                int ny = dirs[i][1] + yy;

                if(nx < 0 || ny < 0 || nx >= n || ny >= m)
                    continue;
                

                if(visited[nx][ny]) continue;
                if(board[nx][ny] == 'X') continue;

                if(nx == 0 || ny == 0 || nx == n - 1 || ny == m - 1){
                    hasNonMarkerble = true;
                }


                q.add(new int[]{nx, ny});
                visited[nx][ny] = true;
                isMarkable[nx][ny] = true;
            }
        }

        if(!hasNonMarkerble){
            for(int i = 0; i < isMarkable.length; i++){
                for(int j = 0; j < isMarkable[i].length; j++){
                    if(isMarkable[i][j]){
                        board[i][j] = 'X';
                    }
                }
            }
        }
    }

    
}