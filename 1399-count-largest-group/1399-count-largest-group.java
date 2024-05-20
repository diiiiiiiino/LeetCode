class Solution {
    public int countLargestGroup(int n) {
        int[] arr = new int[n + 1];


        for(int i = 1; i <= n; i++){
            int num = i;
            int sum = 0;
            while(num != 0){
                sum += num % 10;

                num /= 10;
            }

            arr[sum]++;
        }

        int max = 0;
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(arr[i] > max){
                max = arr[i];
                answer = 1;
            } else if(arr[i] == max){
                answer++;
            }
        }

        return answer;
    }
}