class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        
        for(String t : tokens){
            if("+".equals(t) || "-".equals(t) || "*".equals(t) ||  "/".equals(t)){
                if(stk.size() >= 2){
                    int b = stk.pop();
                    int a = stk.pop();

                    int result = 0;
                    switch(t){
                        case "+" :
                            result = a + b;
                        break;
                        case "-" :
                            result = a - b;
                        break;
                        case "*" :
                            result = a * b;
                        break;
                        case "/" :
                            result = a / b;
                        break;
                    }

                    stk.push(result);
                }
            } else {
                stk.push(Integer.valueOf(t));
            }
        }

        return stk.peek();
    }
}