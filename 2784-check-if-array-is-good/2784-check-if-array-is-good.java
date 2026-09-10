class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;;
        int maxElement=n-1;
        int[] freq=new int[201];
        for(int num:nums){
                 freq[num]++;

        }
        for(int num:nums ){
            if(num>maxElement){
                return false;
            }
            if(num==nums.length-1 && freq[num]!=2){
                return false;
            }    
            if(num!=nums.length-1 && freq[num]>1){
                return false;
            }
         }
    return true;
    }
}