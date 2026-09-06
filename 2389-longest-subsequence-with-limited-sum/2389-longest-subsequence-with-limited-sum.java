class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] answer = new int[queries.length];
        for (int i = 1; i < nums.length; i++) {
           nums[i]+=nums[i-1];
    }
 for(int i=0;i<queries.length;i++){
    answer[i]=binarySearch(nums,queries[i]);
 }
return answer;
}
private int binarySearch(int[] prefixSum,int target){
    int left=0;
    int right=prefixSum.length-1;
    int maxsize=0;
while(left<=right){
    int mid=left+(right-left)/2;
    if(prefixSum[mid]<=target){
        maxsize=mid+1;
        left=mid+1;
    }else{
        right=mid-1;
    }
}
return maxsize;
}
}
