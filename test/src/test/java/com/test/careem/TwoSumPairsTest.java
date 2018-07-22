package com.test.careem;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 14/07/18.
 */
public class TwoSumPairsTest {

    @Test
    public void numberOfPairs() {
        TwoSumPairs twoSumPairs = new TwoSumPairs();
        System.out.println(twoSumPairs.numberOfPairs(new int[]{1,3,46,1,3,9}, 47));
    }
}