package com.test;

/**
 * @author: pavan.g
 * created: 09/05/18.
 */
public class ConsecutiveNumbersSum {
    public int consecutiveNumbersSum(long N) {
        double divisor = 2;
        double quotient = Math.ceil(N/divisor);
        int ways = 1;
        if (N==1) {
            return ways;
        }
        for (double i = quotient; i > 0; i--) {
            boolean broke = false;
            long sum = 0;
            for (double j = i; j > 0; j--) {
                sum += j;
                if (sum == N) {
                    ways += 1;
                } else if (sum > N) {
                    broke = true;
                    break;
                } else {
                    // sum < N
                }
            }
            if (!broke) {
                return ways;
            }
        }

        return 1;
    }
}
