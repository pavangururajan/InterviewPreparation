package com.test.google.array;

/**
 * @author: pavan.g
 * created: 23/05/18.
 */
public class MaxConsecutiveOnes2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int previous1window = 0;
        int current1window = 0;
        int zeroWindow = 0;
        int previous = -1;
        int max = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (previous != nums[i]) {
                if (nums[i] == 1) {
                    previous1window = current1window;
                    current1window = 0;
                } else {
                    //num[i] == 0
                    if (zeroWindow == 1) {
                        max = Math.max(max, previous1window + zeroWindow + current1window);
                    } else {
                        max = Math.max(max, current1window + Math.min(1, zeroWindow));
                    }
                    zeroWindow = 0;
                }
            }
            zeroWindow += nums[i] == 0 ? 1 : 0;
            current1window += nums[i];
            previous = nums[i];
        }
        if (zeroWindow == 1) {
            max = Math.max(max, previous1window + zeroWindow + current1window);
        } else {
            max = Math.max(max, current1window + Math.min(1, zeroWindow));
        }
        return max;
    }
}
