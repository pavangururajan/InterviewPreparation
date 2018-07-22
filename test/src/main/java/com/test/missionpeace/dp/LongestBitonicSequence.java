package com.test.missionpeace.dp;

/**
 * @author: pavan.g
 * created: 15/07/18.
 */
public class LongestBitonicSequence {
    public int longestBintonicSequence(int[] nums) {
        int[] LIS = new int[nums.length];
        int[] LISR = new int[nums.length];
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            LIS[i] = LISR[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    LIS[i] = Math.max(LIS[i], LIS[j] + 1);
                }
            }
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] < nums[i]) {
                    LISR[i] = Math.max(LISR[i], LISR[j] + 1);
                }
            }
        }

        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, LIS[i-1] + LISR[i]);
        }
        return max;
    }
}
