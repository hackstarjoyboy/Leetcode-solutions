class Solution {
    public int minimumOperations(int[] nums) {
      Set<Integer> uniqueNumber=new HashSet<>();
       for(int num:nums){
        if(num>0){
            uniqueNumber.add(num);
        }
       }
       return uniqueNumber.size();
    }
}