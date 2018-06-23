package com.test.google.array;

/**
 * @author: pavan.g
 * created: 23/05/18.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int j = i;
                while (j < nums.length && nums[j] == 0) {
                    j++;
                }
                if (j == nums.length) {
                    return;
                }
                swap(nums, i, j);
            }
        }
    }
    private void swap(int[] input, int pos1, int pos2) {
        int temp = input[pos1];
        input[pos1] = input[pos2];
        input[pos2] = temp;
        System.out.println("Swapping: " + pos1 + " " + pos2);
    }
}
