class Solution {
    public int unequalTriplets(int[] nums) {
        int[] freq=new int[1001];
        for(int num:nums){
            freq[num]++;
        }
        int triplets=0;
        int left=0;
        int right=nums.length;
        for(int count:freq){
            if(count>0){
                right-=count;
                triplets+=left*count*right;
                left+=count;
            }
        }
      return triplets;
    }
}