class Solution {
    public int[] sortedSquares(int[] nums) {
       int n=nums.length;
       int[] arr=new int[n];
       int k=n-1;
       int s=0,e=n-1;
       while(s<=e){
        if(nums[s]*nums[s]>nums[e]*nums[e]){
            arr[k--]=nums[s]*nums[s];
            s++;
        }else{
            arr[k--]=nums[e]*nums[e];
            e--;
        }
       }
       return arr;
    }
}