class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        double minAvg=Double.MAX_VALUE;
        while(left<right){
            double currentAvg=(nums[left]+nums[right])/2.0;
            if(currentAvg<minAvg){
                minAvg=currentAvg;
            }
            left++;
            right--;
        }
        return minAvg;
    }
}