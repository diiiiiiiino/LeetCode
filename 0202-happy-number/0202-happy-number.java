class Solution {
    public boolean isHappy(int n) {
        int count = 0;
        while(n != 1 && n != 4){
            int num = n;

            int sum = 0;
            while(num != 0){
                int mok = num / 10;
                int rest = num % 10;

                sum += Math.pow(rest, 2);

                num = mok;
            }

            n = sum;
        }

        return n == 1;
    }
}