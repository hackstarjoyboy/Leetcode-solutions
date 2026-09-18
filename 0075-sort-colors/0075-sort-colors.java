class Solution {
    public void sortColors(int[] nums) {
        int zeros=0;
        int ones=0;
        for(int n:nums){
            if(n==0){
                zeros++;
            }
            if(n==1){
                ones++;
            }
           
        }
        int twos=nums.length-zeros-ones;
        for(int i=0;i<nums.length;i++){
            if(i<zeros){
                nums[i]=0;
            }else if(i>=zeros && i<zeros+ones){
                nums[i]=1;
            }else if(i>=zeros+ones){
                nums[i]=2;
            }
        }
        
    }
}