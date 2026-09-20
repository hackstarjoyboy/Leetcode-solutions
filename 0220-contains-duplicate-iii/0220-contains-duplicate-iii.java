class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (nums == null || nums.length < 2 || indexDiff < 1 || valueDiff < 0)
            return false;

        Map<Long, Long> map = new HashMap<>();

        long bucketSize = (long) valueDiff + 1;

        for (int i = 0; i < nums.length; i++) {
            // Remap numbers to start from 0 to avoid negative integer division headaches
            long remappedNum = (long) nums[i] - Integer.MIN_VALUE;

            long bucket = remappedNum / bucketSize;

            if (map.containsKey(bucket)) {
                return true;
            }

            if (map.containsKey(bucket - 1) && remappedNum - map.get(bucket - 1) <= valueDiff) {
                return true;
            }

            if (map.containsKey(bucket + 1) && map.get(bucket + 1) - remappedNum <= valueDiff) {
                return true;
            }

            map.put(bucket, remappedNum);

            if (i >= indexDiff) {
                long expiredRemapped = (long) nums[i - indexDiff] - Integer.MIN_VALUE;
                map.remove(expiredRemapped / bucketSize);
            }
        }

        return false;

    }
}