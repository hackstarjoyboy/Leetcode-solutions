class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] modCounts=new int[k];
        modCounts[0]=1;
        int runningSum=0;
        int resultCount=0;
        for(int num:nums){
    runningSum+=num;
    int remainder=runningSum % k ;
    if(remainder<0){
        remainder+=k;
    }
    resultCount+=modCounts[remainder];
    modCounts[remainder]++;
        }
      return resultCount;  
    
    }
}