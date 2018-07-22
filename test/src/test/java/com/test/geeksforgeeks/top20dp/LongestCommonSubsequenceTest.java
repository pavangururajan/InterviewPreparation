package com.test.geeksforgeeks.top20dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 01/07/18.
 */
public class LongestCommonSubsequenceTest {

    @Test
    public void longestCommonSubsequence() {
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        System.out.println(longestCommonSubsequence.longestCommonSubsequence("ABCDGH", "AEDFHR"));
    }
}