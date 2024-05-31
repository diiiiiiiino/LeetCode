class Solution {
    public int minMaxDifference(int num) {
        String maxStr = String.valueOf(num);

        int max = 0;
        for(int i = 0; i < maxStr.length(); i++){
            int n = maxStr.charAt(i) - '0';
            
            if(n < 9){
                max = n;
                break;
            }
        }

        maxStr = maxStr.replace(String.valueOf(max), "9");
        
        String minStr = String.valueOf(num);
        minStr = minStr.replace(minStr.charAt(0), '0');

        return Integer.parseInt(maxStr) - Integer.parseInt(minStr);
    }
}