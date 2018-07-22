package com.test.geeksforgeeks.top20dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 30/06/18.
 */
public class LongestIncreasingSubsequenceTest {

    @Test
    public void longestIncreasingSubsequence() {
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        System.out.println(longestIncreasingSubsequence.longestIncreasingSubsequence(new int[] {10, 9, 2, 3, 7, 5, 4}));
    }
}