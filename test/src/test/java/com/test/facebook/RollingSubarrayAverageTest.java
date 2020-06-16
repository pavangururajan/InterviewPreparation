package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class RollingSubarrayAverageTest {

    @Test
    public void numOfSubarrays() {
        RollingSubarrayAverage rollingSubarrayAverage = new RollingSubarrayAverage();
        System.out.println(rollingSubarrayAverage.numOfSubarrays(new int[]{1,1,1,1,1}, 1, 1));
        System.out.println(rollingSubarrayAverage.numOfSubarrays(new int[]{11,13,17,23,29,31,7,5,2,3}, 3, 5));
    }
}