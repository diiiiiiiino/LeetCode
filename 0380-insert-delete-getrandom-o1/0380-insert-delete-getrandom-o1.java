class RandomizedSet {

    List<Integer> list;
    Map<Integer, Integer> map;
    Random rand = new Random();

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }

        int idx = list.size();
        list.add(val);
        map.put(val, idx);

        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }

        if(list.size() == 1){
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
        

        int idx = map.get(val);
        int lastVal = list.get(list.size() - 1);

        list.set(idx, lastVal);
        list.remove(list.size() - 1);

        map.put(lastVal, idx);
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */