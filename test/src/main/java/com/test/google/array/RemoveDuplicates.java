package com.test.google.array;

/**
 * @author: pavan.g
 * created: 23/05/18.
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int previous = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (previous != nums[i]) {
                nums[j++] = nums[i];
                previous = nums[i];
            }
        }
        return j;
    }
}
