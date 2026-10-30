class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            int subarrays = 1;
            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] > mid) {
                    subarrays++;
                    sum = nums[i];
                } else {
                    sum += nums[i];
                }
            }

            if (subarrays > k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}