class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low; i <= high; i++){
            String str = String.valueOf(i);

            int len = str.length();
            int n = len / 2;
            if(len % 2 == 0){
                int a = Arrays.stream(str.substring(0, n).split(""))
                .mapToInt(Integer::parseInt)
                .sum();
                
                int b = Arrays.stream(str.substring(n, len).split(""))
                .mapToInt(Integer::parseInt)
                .sum();

                if(a == b){
                    count++;
                }
            }
        }

        return count;
    }
}