class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        int curr = 0;
        int prev = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            curr += nums[i];
            if (curr > prev) {
                prev = curr;
            }
            if (curr < 0) {
                curr = 0;
            }
        }

        return prev;
    }
}