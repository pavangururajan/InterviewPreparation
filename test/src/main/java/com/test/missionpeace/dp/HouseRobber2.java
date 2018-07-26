package com.test.missionpeace.dp;

/**
 * https://leetcode.com/problems/house-robber-ii/description/
 * @author: pavan.g
 * created: 24/07/18.
 */
public class HouseRobber2 {

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int maxSum1 = findMaxRobber(nums, 0, nums.length-2);
        int maxSum2 = findMaxRobber(nums, 1, nums.length-1);
        return Math.max(maxSum1, maxSum2);
    }

    private int findMaxRobber(int[] nums, int start, int end) {
        int maxSum = 0;
        int prevSum = 0;
        for (int i = start; i <= end; i++) {
            int temp = prevSum;
            prevSum = maxSum;
            maxSum = Math.max(temp+nums[i], maxSum);
        }
        return maxSum;
    }

}
