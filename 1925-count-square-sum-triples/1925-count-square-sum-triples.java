class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                double c = Math.sqrt(i * i + j * j);
                if(c == (int)c && c <= n){
                    count++;
                }
            }
        }

        return count;
    }
}