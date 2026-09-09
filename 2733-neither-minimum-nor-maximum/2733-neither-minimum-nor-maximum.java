class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3) return -1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
       int max2=Integer.MIN_VALUE;
       for(int num:nums){
     if(num>max){
        max2=max;
      max=num;

     }
     if(num<min){
        min=num;
     }
     }
     for(int num:nums){
        if(num!=max && num!=min){
            max2= num;
        }
     }
return max2;
    }    
}