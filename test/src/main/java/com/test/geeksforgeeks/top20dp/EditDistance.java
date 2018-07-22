package com.test.geeksforgeeks.top20dp;

/**
 * @author: pavan.g
 * created: 30/06/18.
 */
public class EditDistance {
    public int minEditDistance(String A, String B) {
        int[][] dp = new int[A.length()+1][B.length()+1];
        for (int i = 0; i <= A.length(); i++) {
            for (int j = 0; j <= B.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                    continue;
                }
                if (j == 0) {
                    dp[i][j] = i;
                    continue;
                }
                if (A.charAt(i-1) == B.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]);
                }
            }
        }
        return dp[A.length()][B.length()];
    }
}
