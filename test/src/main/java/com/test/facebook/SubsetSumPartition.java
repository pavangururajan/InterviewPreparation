package com.test.facebook;

public class SubsetSumPartition {
    public boolean SubsetSumPartition(int[] nums, int k) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        if (nums.length < k) return false;
        if (sum % k != 0) return false;

        int subsetSum = sum/k;

        int[] subset = new int[k];
        boolean[] taken = new boolean[nums.length];

        subset[0] = nums[nums.length-1];
        taken[nums.length-1] = true;

        return helper(nums, subset, taken, k, nums.length, subsetSum, 0, nums.length-1);
    }

    public boolean helper(int[] nums, int[] subset, boolean[] taken, int k, int n, int subsetSum, int curIdx, int lastIdx) {
        if (subset[curIdx] == subsetSum) {
            if (curIdx == k-2) {
                return true;
            }
            return helper(nums, subset, taken, k, n, subsetSum, curIdx-1, lastIdx);
        }
        for (int i = lastIdx; i >= 0; i--) {
            if (taken[i] == true) {
                continue;
            }
            int tmp = subset[curIdx] + nums[i];
            if (tmp <= subsetSum) {
                taken[i] = true;
                subset[curIdx] += nums[i];
                boolean nxt = helper(nums, subset, taken, k, n, subsetSum, curIdx, lastIdx-1);
                taken[i] = false;
                subset[curIdx] -= nums[i];
                if (nxt) return true;
            }
        }
        return false;
    }
}
