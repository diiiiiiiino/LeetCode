class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        int start = intervals[0][0];
        int end = intervals[0][1];

        List<int[]> list = new ArrayList<>();
        for(int i = 1; i < intervals.length; i++){
            int[] curr = intervals[i];

            if(curr[0] <= end){
                start = Math.min(start, curr[0]);
                end = Math.max(end, curr[1]);
            } else {
                list.add(new int[]{start, end});
                start = curr[0];
                end = curr[1];
            }
        }

        list.add(new int[]{start, end});

        return list.stream()
        .toArray(int[][]::new);
    }
}