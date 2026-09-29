class RandomizedCollection {

 private List<Integer> list;
 private Map<Integer,Set<Integer>>map;
 private Random random;




    public RandomizedCollection() {
        list=new ArrayList<>();
        map=new HashMap<>();
        random=new Random();
    }
    
    public boolean insert(int val) {
        boolean isNew=!map.containsKey(val)||map.get(val).isEmpty();
        if(isNew){
            map.put(val,new LinkedHashSet<>());
        }
        map.get(val).add(list.size());
        list.add(val);
        return isNew;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)|| map.get(val).isEmpty()){
            return false;
        }
        Set<Integer> valIndices=map.get(val);
      int removeIdx=valIndices.iterator().next();
      valIndices.remove(removeIdx);
      int lastIdx=list.size()-1;
      int lastVal=list.get(lastIdx);
      list.set(removeIdx,lastVal);
      map.get(lastVal).add(removeIdx);
      map.get(lastVal).remove(lastIdx);
      list.remove(lastIdx);
      return true;

    }
    
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */