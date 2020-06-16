package com.test.facebook;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class MaxValueAfterReverseTest {

    @Test
    public void maxValueAfterReverse() {
        int[] nums = {2,5,1,3,4};
        MaxValueAfterReverse maxValueAfterReverse = new MaxValueAfterReverse();
        System.out.println(maxValueAfterReverse.maxValueAfterReverse(nums));
    }
}