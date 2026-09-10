class Solution {
    public int countPairs(List<Integer> nums, int target) {
     int n=nums.size();
     int[] arr=new int[n];
     int k=0;
     for(int num:nums){
     arr[k++]=num;
     }
     int count=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j) continue;
       if(arr[i]+arr[j]<target){
        count++;
       }
        }
       }
return count/2;
    }
}