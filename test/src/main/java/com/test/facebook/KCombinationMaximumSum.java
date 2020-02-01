package com.test.facebook;

public class KCombinationMaximumSum {
    public int kConcatenationMaxSum(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int n = arr.length * k;
        int maxSum = 0;
        for (int window = 1; window <= n; window++) {
            System.out.println(window);
            for (int i = 0; i <= n-window; i++) {
                int curSum = 0;
                for (int j=i; j < i+window; j++) {
                    int jdx = j % arr.length;
                    curSum += arr[jdx];
                }
                maxSum = Math.max(curSum, maxSum);
            }
        }
        maxSum = maxSum < 0 ? 0 : maxSum;
        long divisor = (long) Math.pow(10, 9) + 7;
        int remainder = (int) (maxSum % divisor);
        return remainder;
    }
}
