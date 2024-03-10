class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();

        boolean carryFlag = false;
        for(int i = digits.length - 1; i >= 0; i--){
            int num = digits[i] + (i == digits.length - 1 ? 1 : 0);

            if(carryFlag){
                num += 1;
            }

            if(num == 10){
                carryFlag = true;
                sb.insert(0, "0");
            } else {
                carryFlag = false;
                sb.insert(0, String.valueOf(num));
            }
        }

        if(carryFlag){
            sb.insert(0, "1");
        }

        return Arrays.stream(sb.toString().split(""))
        .mapToInt(Integer::valueOf)
        .toArray();
    }
}