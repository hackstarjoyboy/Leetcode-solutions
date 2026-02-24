class Solution {
    public int removeDuplicates(int[] nums) {
      if (nums.length == 0) return 0;



        int first = 0; // slow pointer
        for (int second = 1; second < nums.length; second++) {
            if (nums[second] != nums[first]) {
                first++;
                nums[first] = nums[second]; // place unique element
            }
        }
        //System.out.println(Arrays.toString(nums));
        return first + 1;    
    }
}