class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);

        int max = 0;
        for(int i = 0; i < str.length(); i++){
            int n = str.charAt(i) - '0';
            
            if(n < 9){
                max = n;
                break;
            }
        }

        str = str.replace(String.valueOf(max), "9");
        
        String str2 = String.valueOf(num);
        int min = str2.charAt(0) - '0';
        
        str2 = str2.replace(String.valueOf(min), "0");

        int a1 = Integer.parseInt(str);
        int a2 = Integer.parseInt(str2);

        return a1 - a2;
    }
}