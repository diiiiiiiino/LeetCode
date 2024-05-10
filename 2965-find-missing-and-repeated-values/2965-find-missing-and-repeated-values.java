class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;

        int max = n * n;

        int[] nums = new int[max + 1];

        HashSet<Integer> set = new HashSet<>();

        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int num = grid[i][j];
                
                nums[num]++;
            }
        }

        int repeat = 0;
        int missing = 0;

        for(int i = 0; i <= max; i++){
            if(nums[i] > 1){
                repeat = i;
            }

            if(nums[i] == 0){
                missing = i;
            }
        }

        return new int[]{repeat, missing};
    }
}