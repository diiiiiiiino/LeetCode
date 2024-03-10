class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        
        String[] arr1 = pattern.split("");
        String[] arr2 = s.split(" ");

        if(arr1.length != arr2.length) return false;

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
            set2.add(arr2[i]);
            String s1 = map.get(arr1[i]);

            if(s1 == null){
                map.put(arr1[i], arr2[i]);
            } else {
                if(!s1.equals(arr2[i])){
                    return false;
                }
            }
        }

        if(set.size() != set2.size()){
            return false;
        }

        return true;
    }
}