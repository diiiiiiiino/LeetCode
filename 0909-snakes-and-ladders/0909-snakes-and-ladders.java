class Solution {

    public int snakesAndLadders(int[][] board) {
        int n = board.length;

        return bfs(board);
    }

    private int bfs(int[][] board){
        int n = board.length;
        Set<Integer> set = new HashSet<>();
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1, 0});
        set.add(1);

        while(!q.isEmpty()){
            int[] arr = q.poll();
            int idx = arr[0];
            int dist = arr[1];

            if(idx == n * n){
                return dist;
            }

            for(int i = idx + 1; i <= Math.min(idx + 6, n * n); i++){
                int c = (i - 1) / n;
                int row = n - c - 1 ;

                int d = (i - 1) % n;
                int col = c % 2 == 0 ? d : n - d - 1;

                int nextIdx = board[row][col] != -1 ? board[row][col] : i;

                if(set.contains(nextIdx)) continue;
                
                set.add(nextIdx);
                q.add(new int[]{nextIdx, dist + 1});
            }
        }

        return -1;
    }
}