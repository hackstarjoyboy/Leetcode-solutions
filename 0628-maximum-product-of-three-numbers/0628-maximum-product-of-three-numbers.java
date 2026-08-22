class Solution {
    public int maximumProduct(int[] nums) {
         int i=nums.length-1; 
       
        Arrays.sort(nums);
        int sum=0;
  sum= Math.max(nums[0]*nums[1]*nums[i],nums[i]*nums[i-1]*nums[i-2]);
       return sum;
    }
}