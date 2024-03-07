class Solution {
    public boolean isSubsequence(String s, String t) {
        int l = 0, r = 0;
        
        int count = 0;
        while(l < s.length() && r < t.length()){
            char lch = s.charAt(l);
            char rch = t.charAt(r);
            
            if(lch == rch){
                l++;
                r++;
                count++;
            } else {
                r++;
            }
        }
        
        return count == s.length();
    }
}