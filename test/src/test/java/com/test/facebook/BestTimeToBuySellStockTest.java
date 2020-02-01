package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuySellStockTest {

    @Test
    public void maxProfit() {
        BestTimeToBuySellStock obj = new BestTimeToBuySellStock();
        int profit = obj.maxProfit(new int[] {1,3,7,5,10,3}, 3);
        System.out.println("Max profit: " + profit);
    }
}