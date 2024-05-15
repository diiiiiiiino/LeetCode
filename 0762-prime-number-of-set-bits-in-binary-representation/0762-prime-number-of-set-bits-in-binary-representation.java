class Solution {
    public int countPrimeSetBits(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int num = i;

            int count = 0;
            while(num != 0){
                int rest = num % 2;
                if(rest == 1){
                    count++;
                }

                num /= 2;
            }

            if(count == 1){
                continue;
            }

            boolean isPrime = true;
            for(int k = 2; k < count; k++){
                if(count % k == 0){
                    isPrime = false;
                }
            }

            if(isPrime){
                answer++;
            }
        }

        return answer;
    }
}