class Solution {
    public int distinctAverages(int[] nums) {
        int[] arr=new int[101];
       
        for(int num:nums){
            arr[num]++;
        }
        boolean[] seen=new boolean[201];
        int distinctcount=0;
    
        int i=0;
        int j=100;
       int pairRemaining=nums.length/2;
        while(pairRemaining>0){
           while(arr[i]==0){
            i++;
           }
           while(arr[j]==0){
            j--;
           }
           int currentSum=i+j;
           if(!seen[currentSum]){
            seen[currentSum]=true;
            distinctcount++;

           }
           arr[i]--;
           arr[j]--;
           pairRemaining--;
            }
           
        
        return distinctcount;
    }
}