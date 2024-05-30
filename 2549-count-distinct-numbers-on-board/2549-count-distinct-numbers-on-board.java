class Solution {
    public int distinctIntegers(int n) {
        Set<Integer> set = new HashSet<>();
        Stack<Integer> stk = new Stack<>();

        stk.push(n);
        set.add(n);
        
        while(!stk.isEmpty()){
            int num = stk.pop();

            for(int i = 2; i < n; i++){
                if(num % i == 1){
                    set.add(i);
                    stk.push(i);
                }
            }
        }
        
        return set.size();
    }
}