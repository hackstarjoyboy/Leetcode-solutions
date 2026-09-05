class Solution {
    public int minimumOperations(int[] nums) {
       
        Arrays.sort(nums);
 int count=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            continue;
            }else if(nums[i]>0){
                count++;
                int current=nums[i];
              for(int j=i;j<nums.length;j++){
           nums[j]=nums[j]-current;
             }

            } 
            }
    return count;
}
}