package com.test;

/**
 * @author: pavan.g
 * created: 15/07/18.
 */
public class BinaryGap {
    public int binaryGap(int N) {
        int diff = 0;
        int prev = Integer.MAX_VALUE;
        int position = 0;
        while (N != 0) {
            int remainder = N % 2;
            if (remainder == 1) {
                diff = Math.max(diff, position - prev);
                prev = position;
            }
            position++;
            N /= 2;
        }
        return diff;
    }
}
