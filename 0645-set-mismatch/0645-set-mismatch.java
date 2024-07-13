class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);

        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();
        int k = 1;
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);

            if(k == n){
                k++;
            }

            int count = map.get(n);
            if(count == 2){
                list.add(n);
            }
        }

        list.add(k);

        int[] answer = list.stream()
            .mapToInt(Integer::valueOf)
            .toArray();

        return answer;
    }
}