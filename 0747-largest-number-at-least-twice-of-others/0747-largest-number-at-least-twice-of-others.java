class Solution {
    public int dominantIndex(int[] nums) {
      int largest=-1;
      int index=-1;
      int n=nums.length;
      for(int i=0;i<n;i++){
        if(largest<nums[i]){
            largest=nums[i];
            index=i;
        }
      }
    for(int j=0;j<n;j++){
        if(j==index) continue;
       if(largest<2*nums[j]){
        return -1;
       }

     }
      
      return index;


    }
}