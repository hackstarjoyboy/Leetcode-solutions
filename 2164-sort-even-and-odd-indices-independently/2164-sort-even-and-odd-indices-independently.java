class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] evenCount = new int[101];
        int[] oddCount = new int[101];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenCount[nums[i]]++;

            } else {
                oddCount[nums[i]]++;
            }
        }
        int evenVal = 0;
        int oddVal = 100;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                while (evenCount[evenVal] == 0) {
                    evenVal++;
                }
                nums[i] = evenVal;
                evenCount[evenVal]--;
            } else {
                while (oddCount[oddVal] == 0) {
                    oddVal--;
                }
                nums[i] = oddVal;
                oddCount[oddVal]--;
            }

        }
        return nums;
    }
}