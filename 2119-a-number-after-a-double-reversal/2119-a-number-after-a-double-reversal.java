class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0){
            return true;
        }

        int n1 = num;

        StringBuilder sb = new StringBuilder();
        int len = 0;
        while(n1 != 0){
            int rest = n1 % 10;

            n1 /= 10;

            sb.append(rest);
            len++;
        }

        int n = Integer.parseInt(sb.toString());
        String s = String.valueOf(n);

        return len == s.length();
    }
}