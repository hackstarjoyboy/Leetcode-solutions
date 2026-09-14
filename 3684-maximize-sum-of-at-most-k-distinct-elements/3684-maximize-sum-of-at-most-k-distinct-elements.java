class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int j=0;
        int prev=0;
      
        List<Integer> l=new ArrayList<>();

        for(int i=n;i>=0;i--){
            if(prev==nums[i])continue;
     if(j<k){
       l.add(nums[i]);
        j++;
     }
     prev=nums[i];
        }
int index=0;
  int[] arr=new int[l.size()];
  for(int p:l){
    arr[index++]=p;
  }
return arr;
    }
}