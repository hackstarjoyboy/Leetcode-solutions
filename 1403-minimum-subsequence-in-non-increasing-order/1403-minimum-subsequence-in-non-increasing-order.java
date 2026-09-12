class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int[] freq=new int[101];
        int totalSum=0;
        for(int num:nums){
          totalSum+=num;
          freq[num]++;
        }
    List<Integer> result=new ArrayList<>();
    int currentSum=0;
    for(int i=100;i>=1;i--){

while(freq[i]>0){
    result.add(i);
    currentSum+=i;
    totalSum-=i;
    if(currentSum>totalSum){
        return result;
    }
    freq[i]--;
}
    }
return result;
    }
}