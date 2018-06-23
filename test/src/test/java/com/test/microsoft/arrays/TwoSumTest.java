package com.test.microsoft.arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 06/06/18.
 */
public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum t = new TwoSum();
        int[] n = {2,7,11,15};
        System.out.println(Arrays.toString(t.twoSum(n, 9)));
    }
}