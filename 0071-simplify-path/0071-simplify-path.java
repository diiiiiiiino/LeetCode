class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();

        String[] strs = path.split("/");

        for(String s : strs){
            if(!s.isEmpty()) {
                if(s.equals("..")){
                    if(!stk.isEmpty()){
                        stk.pop();
                    }
                } else if(s.equals(".")){
                    continue;
                } else {
                    stk.push("/" + s);
                }
            }
        }

        if(stk.isEmpty()){
            return "/";
        }

        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.insert(0, stk.pop());
        }

        return sb.toString();
    }
}