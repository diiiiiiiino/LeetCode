class Solution {
    public int maximumWealth(int[][] accounts) {
       int[] answer = Arrays.stream(accounts)
        .map(arr -> Arrays.stream(arr).sum())
        .mapToInt(Integer::valueOf)
        .sorted()
        .toArray();

        int len = answer.length - 1;
        return answer[len];
    }
}