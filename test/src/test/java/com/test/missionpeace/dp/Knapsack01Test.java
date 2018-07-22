package com.test.missionpeace.dp;

import org.junit.Test;

/**
 * @author: pavan.g
 * created: 21/07/18.
 */
public class Knapsack01Test {

    @Test
    public void getMaxValueDP() {
        Knapsack01 knapsack01 = new Knapsack01();
        int[] weights = new int[]{31, 10, 20, 19, 3, 4, 6};
        int[] values = new int[]{70, 20, 39, 37, 7, 5, 10};
        System.out.println(knapsack01.getMaxValueDP(50, weights, values));
        System.out.println(knapsack01.getMaxValueDP());
    }
}