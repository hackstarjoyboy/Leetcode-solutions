class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int[] num:items1){
            map.put(num[0],map.getOrDefault(num[0],0)+num[1]);
        }
         for(int[] num:items2){
            map.put(num[0],map.getOrDefault(num[0],0)+num[1]);
        }
    List<List<Integer>> result=new ArrayList<>();
   for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    result.add(Arrays.asList(entry.getKey(),entry.getValue()));
   }
   return result;
   }

    }
