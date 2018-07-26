package com.test.missionpeace.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 25/07/18.
 */
public class PalindromePartitioningTest {

    @Test
    public void partition() {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        System.out.println(palindromePartitioning.partition("aab"));
    }
}