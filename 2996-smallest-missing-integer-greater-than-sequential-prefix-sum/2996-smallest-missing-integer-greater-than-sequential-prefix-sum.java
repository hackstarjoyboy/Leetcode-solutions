class Solution {
    public int missingInteger(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int prefix=nums[0]; 
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                prefix+=nums[i];
            }else{
                break;
            }
        }
        boolean[] isPresent=new boolean[51];
        for(int num:nums){
            isPresent[num]=true;
        }
        while(prefix<=50&&isPresent[prefix]){
            prefix++;
        }
        return prefix;
    }
}