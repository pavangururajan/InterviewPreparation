package com.test.missionpeace.dp;

/**
 * @author: pavan.g
 * created: 24/07/18.
 */
public class MaxProductCutting {
    public int maxProduct(int n) {
        int max = 0;
        if (n == 1 || n == 0) return 0;
        for (int i = 1; i < n; i++) {
            max = Math.max(i * (n-i), max);
            max = Math.max(max, i * maxProduct(n-i));
        }
        return max;
    }
}
