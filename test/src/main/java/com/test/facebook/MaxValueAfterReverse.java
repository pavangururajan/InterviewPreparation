package com.test.facebook;

public class MaxValueAfterReverse {
    public int maxValueAfterReverse(int[] nums) {
        int total = 0;
        for (int i = 1; i < nums.length; i++) {
            int diff= Math.abs(nums[i] - nums[i-1]);
            total += diff;
        }
        int maxTotal = 0;
        for (int window = 2; window < nums.length; window++) {
            for (int i = 0; i + window <= nums.length; i++) {
                int left = i > 0 ? nums[i-1] : nums[i];
                int right = i+window < nums.length ? nums[i+window] : nums[i+window-1];

                int leftLoss = i == 0 ? 0 : Math.abs(left-nums[i]);
                int rightLoss = i+window == nums.length ? 0 : Math.abs(right-nums[i+window-1]);

                int leftGain = i == 0 ? 0 : Math.abs(right-nums[i]);
                int rightGain = i+window == nums.length ? 0 : Math.abs(left-nums[i+window-1]);

                int subTotal = total - leftLoss - rightLoss + leftGain + rightGain;
                maxTotal = Math.max(subTotal, maxTotal);
            }
        }
        return maxTotal;
    }
}
