package com.test.facebook;

public class DutchFlagProblem {
    public void sortColors(int[] nums) {
        int pivot = 1;
        int smaller = 0, equal = 0, larger = nums.length;
        while (equal < larger) {
            if (nums[equal] < pivot) {
                swap(nums, smaller++, equal++);
            } else if (nums[equal] == pivot) {
                equal++;
            } else {
                swap(nums, equal, --larger);
            }
        }
    }

    private void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
}
