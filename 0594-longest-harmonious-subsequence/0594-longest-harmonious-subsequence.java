class Solution {
    public int findLHS(int[] nums) {
        int maxSum=0;
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<n;i++){
            int num=nums[i];
            int prev=num-1;
            int next=num+1;
            if(map.containsKey(next)){
                int x=map.get(num)+map.get(next);
                maxSum=Math.max(maxSum,x);
            }   
            
            if(map.containsKey(prev)){
                int y=map.get(num)+map.get(prev);
                maxSum=Math.max(maxSum,y);
            }

            
            
         }
         return maxSum;
    }
}