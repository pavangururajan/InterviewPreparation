package com.test.google.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 18/05/18.
 */
public class TrappingRainWaterTest {

    @Test
    public void trap() {
        int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        System.out.println(trappingRainWater.trap(input));
    }
}