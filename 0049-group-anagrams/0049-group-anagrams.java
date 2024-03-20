class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> answer = new ArrayList<>();

        for(String str : strs){
            char[] arr = str.toCharArray();

            Arrays.sort(arr);

            StringBuilder sb = new StringBuilder();
            for(char ch : arr){
                sb.append(String.valueOf(ch));
            }

            map.putIfAbsent(sb.toString(), new ArrayList<>());
            List<String> list = map.get(sb.toString());
            list.add(str);
        }

        for(String key : map.keySet()){
            answer.add(map.get(key));
        }

        return answer;
    }
}