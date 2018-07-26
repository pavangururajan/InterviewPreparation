package com.test.missionpeace.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 24/07/18.
 */
public class MaxLengthChainPairsTest {

   @Test
   public void test()  {
       int[][] input = { {5, 24}, {15, 25},
                         {27, 40}, {50, 60} };
       MaxLengthChainPairs maxLengthChainPairs = new MaxLengthChainPairs();
       System.out.println(maxLengthChainPairs.maxLength(input));
   }

}