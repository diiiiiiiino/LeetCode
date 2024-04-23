class Solution {
    private final static int[][] dirs = { {0 , 1}, {1, 0} };

    private static class Data{
        int x;
        int y;
        int dist;

        public Data(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public int uniquePaths(int m, int n) {
        Queue<Data> q = new LinkedList<>();
        Set<String> set = new HashSet<>();
        int[][] dist = new int[m][n];

        q.add(new Data(0,0));
        dist[0][0] = 1;
        
        while(!q.isEmpty()){
            Data d = q.poll();
            int x = d.x;
            int y = d.y;

            if(x == m - 1 && y == n - 1){
                return dist[x][y];
            }


            for(int i = 0; i < dirs.length; i++){
                int nx = x + dirs[i][0];
                int ny = y + dirs[i][1];

                if(nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
                
                dist[nx][ny] += dist[x][y];
                if(set.contains(nx + "," + ny)) continue;

                q.add(new Data(nx, ny));
                set.add(nx + "," + ny);
            }
        }

        return 0;
    }
}