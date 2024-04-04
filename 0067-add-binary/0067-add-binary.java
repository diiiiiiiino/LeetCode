class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        if(a.length() > b.length()){
            sb.append("0".repeat(a.length() - b.length()))
              .append(b);

            b = sb.toString();
        } else {
            sb.append("0".repeat(b.length() - a.length()))
              .append(a);
            a = sb.toString();
        }


        sb = new StringBuilder();

        int carry = 0;
        for(int i = a.length() - 1; i >= 0 ; i--){
            int num1 = a.charAt(i) - '0';
            int num2 = b.charAt(i) - '0';

            int sum = num1 + num2 + carry;

            carry = sum / 2;
            int add = sum % 2;

            sb.append(String.valueOf(add));
        }

        if(carry > 0){
            sb.append(String.valueOf(carry));
        }
       
        return sb.reverse().toString();
    }
}