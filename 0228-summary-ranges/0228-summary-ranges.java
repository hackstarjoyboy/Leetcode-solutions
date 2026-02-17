class Solution {
    public List<String> summaryRanges(int[] nums) {
 List<String> l=new ArrayList<>();
 int n=nums.length;
 if(n==0) return l;
 int start=nums[0];
 for(int i=0;i<n;i++){
    if(i==n-1||nums[i]+1!=nums[i+1]){
        StringBuilder sb=new StringBuilder();
        sb.append(start);
        if(start!=nums[i]){
            sb.append("->").append(nums[i]);
        }
        l.add(sb.toString());
         if(i<n-1)start=nums[i+1];

    }
    
   
 }
        return l;
    }
}