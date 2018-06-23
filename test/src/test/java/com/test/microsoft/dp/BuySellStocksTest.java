package com.test.microsoft.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 08/06/18.
 */
public class BuySellStocksTest {

    @Test
    public void maxProfit() {
        BuySellStocks b = new BuySellStocks();
        System.out.println(b.maxProfit(new int[] {7,6,4,3,1}));
    }
}