class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int answer = 0;        
        for(List<String> list : items){
            int idx = getIndex(ruleKey);
            if(ruleValue.equals(list.get(idx))){
                answer++;
            }
        }

        return answer;
    }

    private int getIndex(String ruleKey){
        int idx = 0;
        if(ruleKey.equals("color")){
            idx = 1;
        } else if(ruleKey.equals("name")){
            idx = 2;
        }

        return idx;
    }
}