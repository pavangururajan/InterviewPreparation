package com.test.geeksforgeeks.top20dp;

/**
 * @author: pavan.g
 * created: 30/06/18.
 */
public class LongestIncreasingSubsequence {
    public int longestIncreasingSubsequence(int[] nums) {
        int[] lis = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            lis[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
            max = Math.max(max, lis[i]);
        }
        return max;
    }
}
