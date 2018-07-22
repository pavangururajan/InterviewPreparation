package com.test.geeksforgeeks.top20dp;

import java.util.Arrays;

/**
 * @author: pavan.g
 * created: 30/06/18.
 */
public class PartitionArrayWithMinSumDiff {

    public int minSumDiff(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        boolean[][] dp = new boolean[nums.length+1][sum+1];
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0) {
                    if (j == 0) dp[i][j] = true;
                    continue;
                }
                if (j == 0) {
                    dp[i][j] = true;
                }
                if (j < nums[i-1]) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j - nums[i-1]];
                }
            }
        }
        int diff = Integer.MAX_VALUE;
        for(int i = sum/2; i > 0; i++) {
            if (dp[nums.length][i]) {
                diff = sum - 2*i;
                break;
            }
        }
        return diff;
    }
}
