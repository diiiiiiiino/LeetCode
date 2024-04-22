class Solution {
    public String multiply(String num1, String num2) {
       int n = num1.length(), m = num2.length();
       int[] answer = new int[n + m];
        
        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                int n1 = num1.charAt(i) - '0';
                int n2 = num2.charAt(j) - '0';

                int multi = n1 * n2;

                int p1 = i + j, p2 = i + j + 1;
                int sum = multi + answer[p2];

                answer[p1] += sum / 10;
                answer[p2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        
        for(int num : answer){
            if(sb.length() == 0 && num == 0) continue;
            sb.append(num);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}