package com.test.missionpeace.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 22/07/18.
 */
public class LongestPalindromicSubsequenceTest {

    @Test
    public void lps() {
        LongestPalindromicSubsequence longestPalindromicSubsequence = new LongestPalindromicSubsequence();
        System.out.println(longestPalindromicSubsequence.lps("BBABCBCAB"));
        System.out.println(longestPalindromicSubsequence.lpsRecursive("BBABCBCAB"));
    }
}