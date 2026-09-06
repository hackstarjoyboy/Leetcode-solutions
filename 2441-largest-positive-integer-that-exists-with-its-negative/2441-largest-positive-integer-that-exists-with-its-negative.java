class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int ans=-1;
        for(int i=0;i<nums.length;i++)
        {
     if(set.contains(nums[i]*(-1))){
        int absVal=Math.abs(nums[i]);
        if(absVal>ans){
             ans=absVal;
        }
       
     }
     set.add(nums[i]);
       }
        
        return ans;
    }
}