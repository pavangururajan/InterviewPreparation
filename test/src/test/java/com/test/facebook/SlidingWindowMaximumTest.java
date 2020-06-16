package com.test.facebook;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SlidingWindowMaximumTest {

    @Test
    public void maxSlidingWindow() {
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(slidingWindowMaximum.maxSlidingWindow(nums, 3)));
    }
}