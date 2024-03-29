class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> intervalList = new ArrayList<>(Arrays.asList(intervals));
        intervalList.add(newInterval);

        Collections.sort(intervalList, (a, b) -> a[0] - b[0]);

        List<int[]> answers = new ArrayList<>();

        for(int[] interval : intervalList){
            int size = answers.size();
            if(size == 0 || answers.get(size - 1)[1] < interval[0]){
                answers.add(interval);
            } else if(answers.get(size - 1)[1] >= interval[0]){
                answers.get(size - 1)[1] = Math.max(answers.get(size - 1)[1], interval[1]);
            }
        }

        return answers.stream()
                .toArray(int[][]::new);
    }
}