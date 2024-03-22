class MinStack {

    static class Data{
        int val;
        int minVal;

        public Data(int val, int minVal){
            this.val = val;
            this.minVal = minVal;
        }
    }

    private int min = Integer.MAX_VALUE;
    private Stack<Data> stk;

    public MinStack() {
        stk = new Stack<>();
    }
    
    public void push(int val) {
        min = Math.min(val, min);
        stk.push(new Data(val, min));
    }
    
    public void pop() {
        stk.pop();
        min = stk.isEmpty() ? Integer.MAX_VALUE: stk.peek().minVal;
    }
    
    public int top() {
        return stk.peek().val;
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */