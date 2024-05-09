class Solution {
    int answer = 0;

    public int distributeCandies(int n, int limit) {
        int[] selected = new int[3];

        recFunc(0, 0, n, limit, selected);

        return answer;
    }

    private void recFunc(int k, int sum, int n, int limit, int[] selected){
        if(k == 3){
            if(sum == n){
                answer++;
            }
        } else {
            for(int i = 0; i <= limit; i++){
                recFunc(k + 1, sum + i, n, limit, selected);
            }
        }
    }
}