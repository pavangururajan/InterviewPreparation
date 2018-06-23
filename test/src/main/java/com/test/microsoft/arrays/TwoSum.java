package com.test.microsoft.arrays;

import java.util.Arrays;

/**
 * @author: pavan.g
 * created: 06/06/18.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length < 2) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && nums[i] < target; i++) {
            int index = binarySearch(nums, i+1, nums.length-1, target-nums[i]);
            if (index != -1) {
                result[0] = i;
                result[1] = index;
                return result;
            }
        }
        return result;
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = (start+end)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
