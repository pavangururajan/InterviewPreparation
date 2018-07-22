package com.test.missionpeace.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 15/07/18.
 */
public class CoinChangeTest {
    @Test
    public void coinChange() {
        CoinChange coinChange = new CoinChange();
        System.out.println(coinChange.coinChange(new int[] {1,2,5}, 5));
    }

    @Test
    public void testcoinminchange() {
        CoinChange coinChange = new CoinChange();
        System.out.println(coinChange.coinMinChange(new int[]{2}, 3));
    }
}