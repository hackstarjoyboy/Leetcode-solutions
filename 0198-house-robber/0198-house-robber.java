class Solution {
    public int rob(int[] nums) {
 if(nums==null || nums.length==0)return 0;
 int prev2=0;
 int prev1=0;
 for(int currentHouseValue:nums){
    int currentMax=Math.max(prev1,prev2+currentHouseValue);
    prev2=prev1;
    prev1=currentMax;
 }
 return prev1;
    }
}