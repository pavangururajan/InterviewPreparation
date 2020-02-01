package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class KCombinationMaximumSumTest {

    @Test
    public void kConcatenationMaxSum() {
        KCombinationMaximumSum obj = new KCombinationMaximumSum();
        int[] A = new int[]{-1,5,-7,2,-1,0,7,6,2,4};
        System.out.println(obj.kConcatenationMaxSum(A, 1));
    }
}