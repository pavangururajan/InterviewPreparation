package com.test.geeksforgeeks.top20dp;

/**
 * @author: pavan.g
 * created: 01/07/18.
 */
public class WaysToCoverADistance {
    public int ways(int distance) {
        int dp[] = new int[distance+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= distance; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[distance];
    }
}
