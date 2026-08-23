class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
           if((nums[right]&1)==1){
            right--;
           }
           else if((nums[left]&1)==0){
            left++;
           }
           else{
               int temp=nums[left];
               nums[left]=nums[right];
               nums[right]=temp;
           
        right--;
        left++;

        }
        }
        
        return nums;
    }
}