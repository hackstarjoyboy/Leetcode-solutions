class Solution {
    public int absDifference(int[] nums, int k) {
        int[] freq=new int[101];
        for(int num:nums){
            freq[num]++;
        } 
        int minSum=0;
        int kmin=k;
        for(int i=1;i<=100 && kmin>0 ;i++){
          int take=Math.min(freq[i],kmin);
          minSum+=take*i;
          kmin-=take;
        }
        int maxsum=0;
        int kmax=k;
        for(int i=100;i>=1 && kmax>0 ;i--){
          int take=Math.min(freq[i],kmax);
          maxsum+=take*i;
          kmax-=take;
           
        }
        return maxsum-minSum;
    }
}