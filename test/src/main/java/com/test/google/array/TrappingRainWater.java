package com.test.google.array;

/**
 * @author: pavan.g
 * created: 18/05/18.
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int[] leftBiggest = new int[height.length];
        int[] rightBiggest = new int[height.length];

        leftBiggest[0] = height[0];
        rightBiggest[height.length-1] = height[height.length-1];

        for (int i = 1, j=height.length-2; i < height.length && j >= 0; i++, j--) {
            leftBiggest[i] = Math.max(leftBiggest[i-1], height[i]);
            rightBiggest[j] = Math.max(rightBiggest[j+1], height[j]);
        }
        int sum = 0;
        for (int i = 0; i< height.length; i++) {
            sum += (Math.min(leftBiggest[i], rightBiggest[i]) - height[i]);
        }
        return sum;
    }
}
