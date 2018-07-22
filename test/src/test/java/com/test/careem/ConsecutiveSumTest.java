package com.test.careem;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 14/07/18.
 */
public class ConsecutiveSumTest {

    @Test
    public void consecutiveSum() {
        ConsecutiveSum consecutiveSum = new ConsecutiveSum();
        System.out.println(consecutiveSum.consecutiveSum(16));
    }
}