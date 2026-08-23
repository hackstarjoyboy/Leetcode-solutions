class Solution {
    public int dominantIndex(int[] nums) {
     int max1=-1;
     int max2=-1;
     int index=-1;
     int n=nums.length;
     for(int i=0;i<n;i++){
        if(nums[i]>max1){
            max2=max1;
            max1=nums[i];
            index=i;
        }else if(max2<nums[i]){
            max2=nums[i];
        }
     }
     if(2*max2>max1){
        return -1;
     }else{
        return index;
     }
      }
}