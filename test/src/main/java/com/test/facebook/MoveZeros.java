package com.test.facebook;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        merge(nums, 0, nums.length-1);
    }

    private int merge(int[] nums, int start, int end) {
        if (start >= end) return start;
        int mid = (start+end)/2;
        int left = merge(nums, start, mid);
        int right = merge(nums, mid+1, end);

        while (left <= mid && nums[left] != 0) left++;

        while (right <= end) {
            nums[left] = nums[right];
            left++;
            right++;
        }
        while (left <= end) nums[left++] = 0;
        return start;
    }
}
