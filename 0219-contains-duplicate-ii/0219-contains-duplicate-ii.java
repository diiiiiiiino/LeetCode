class Solution {
    static class Data implements Comparable<Data>{
        private int index;
        private int value;

        Data(int index, int value){
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Data data){
            if(value == data.value){
                return index - data.index;
            }

            return value - data.value;
        }
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Data[] datas = new Data[nums.length];
        for(int i = 0; i < nums.length; i++){
            datas[i] = new Data(i, nums[i]);
        }
        
        Arrays.sort(datas);

        for(int i = 0; i < datas.length - 1; i++){
            Data curr = datas[i];
            Data next = datas[i + 1];

            if(curr.value == next.value && Math.abs(curr.index - next.index) <= k){
                return true;
            }
        }

        return false;
    }
}