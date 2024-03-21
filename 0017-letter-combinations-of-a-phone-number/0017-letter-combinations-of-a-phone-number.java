class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, List<String>> map = new HashMap<>();
        map.put('2', List.of("a", "b", "c"));
        map.put('3', List.of("d", "e", "f"));
        map.put('4', List.of("g", "h", "i"));
        map.put('5', List.of("j", "k", "l"));
        map.put('6', List.of("m", "n", "o"));
        map.put('7', List.of("p", "q", "r", "s"));
        map.put('8', List.of("t", "u", "v"));
        map.put('9', List.of("w", "x", "y", "z"));      


        List<String> list = new ArrayList<>();
        recFunc(0, digits, "", list, map);

        return list;
    }

    private void recFunc(int k, String digits, String s, List<String> list, Map<Character, List<String>> map){
        if(digits.length() == 0){
            return;
        }

        if(k == digits.length()){
            list.add(s);
        } else {
            List<String> strs = map.get(digits.charAt(k));

            for(int i = 0; i < strs.size(); i++){
                recFunc(k + 1, digits, s + strs.get(i), list, map);
            }
        }
    }
}