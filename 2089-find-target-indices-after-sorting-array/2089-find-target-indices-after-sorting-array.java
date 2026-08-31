class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      if(nums.length==1 && nums[0]==target) return new ArrayList<>(List.of(0));
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                l.add(i);
            }
        }
        return l;
 }
}