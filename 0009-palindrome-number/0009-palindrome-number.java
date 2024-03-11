class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        
        Stack<Integer> stk = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        
        while(x > 0){
            int rest = x % 10;
            x = x / 10;

            stk.push(rest);
            queue.add(rest);
        }

        while(!stk.isEmpty() && !queue.isEmpty()){
            if(stk.pop() != queue.poll()){
                return false;
            }
        }

        return true;
    }
}