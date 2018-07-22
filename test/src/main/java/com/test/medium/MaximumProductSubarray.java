package com.test.medium;

/**
 * @author: pavan.g
 * created: 11/07/18.
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    private int helper(int[] nums, int start, int end) {
        int maxProduct = Integer.MIN_VALUE;
        if (start > end) {
            return Integer.MIN_VALUE;
        }
        for (int i = start; i <= end; i++) {
            if (nums[i] == 0) {
                maxProduct = Math.max(0, Math.max(maxProduct, helper(nums, start, i-1)));
                start = i+1;
            }
        }
        int noOfMinus = 0;
        int firstMinus = -1;
        int lastMinus = end+1;
        for (int i = start; i <= end; i++) {
            if (nums[i] < 0) {
                noOfMinus++;
                if (firstMinus == -1) firstMinus = i;
                lastMinus = i;
            }
        }
        int product = 1;
        for (int i = firstMinus+1; i < lastMinus; i++) {
            product *= nums[i];
        }
        if (noOfMinus % 2 == 0) {
            maxProduct = Math.max(maxProduct, product);
        } else {
            int first = 1;
            int last = 1;
            for (int i = start; i <= firstMinus; i++) {
                first *= nums[i];
            }
            for (int i = lastMinus; i <= end; i++) {
                last *= nums[i];
            }
            maxProduct = Math.max(maxProduct, Math.max(product*first, product*last));
        }
        return maxProduct;
    }
}
