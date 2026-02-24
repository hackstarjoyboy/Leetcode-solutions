class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            Integer needed=h.get(target-nums[i]);
            if(needed!=null){
               return new int[]{needed,i};

            }
            h.put(nums[i],i);

        }
        return new int[0] ;
    }
}