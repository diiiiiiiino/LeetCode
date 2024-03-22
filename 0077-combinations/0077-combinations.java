class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        recFunc(0, k, n, new int[k], answer);

        return answer;
    }

    private void recFunc(int depth, int k, int n, int[] selected, List<List<Integer>> answer){
        if(depth == k){
            List<Integer> list = new ArrayList<>();
            answer.add(list);

            for(int i = 0; i < k; i++){
                list.add(selected[i]);
            }
        } else {
            int start = 1;
            if(depth > 0){
                start = selected[depth - 1] + 1; 
            }

            for(int i = start; i <= n; i++){
                selected[depth] = i;
                recFunc(depth + 1, k, n, selected, answer);
                selected[depth] = 0;
            }
        }
    }
}