class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenumber=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(seenumber.contains(nums[i])){
                return true;
            }
            seenumber.add(nums[i]);
       
        }
        return false;
    
    }
}