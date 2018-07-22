package com.test.careem;

/**
 * @author: pavan.g
 * created: 14/07/18.
 */
public class ConsecutiveSum {
    public int consecutiveSum(int num) {
        if (num == 0 || num == 1 || num == 2) return 0;
        int sum = 0;
        int start = 0;
        int end = 0;
        int count = 0;
        while(end <= Math.ceil(num/2)+1) {
            if (sum < num) {
                end++;
                sum += end;
            } else if (sum == num) {
                count++;
                end++;
                sum += end;
            } else {
                start++;
                sum -= start;
            }
        }
        return count;
    }
}
