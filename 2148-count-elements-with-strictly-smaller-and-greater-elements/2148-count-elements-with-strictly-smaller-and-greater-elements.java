class Solution {
    public int countElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > min && nums[i] < max) {
                count++;
            }

        }
        return count;
    }

}