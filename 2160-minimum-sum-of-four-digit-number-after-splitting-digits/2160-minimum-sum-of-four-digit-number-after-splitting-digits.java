class Solution {
    public int minimumSum(int num) {
        String[] strs = String.valueOf(num).split("");
        
        Arrays.sort(strs);

        return Integer.parseInt(strs[0] + strs[3]) + Integer.parseInt(strs[1] + strs[2]); 
    }
}