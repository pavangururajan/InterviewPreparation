package com.test.missionpeace.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 15/07/18.
 */
public class LongestBitonicSequenceTest {

    @Test
    public void longestBintonicSequence() {
        LongestBitonicSequence longestBitonicSequence = new LongestBitonicSequence();
        System.out.println(longestBitonicSequence.longestBintonicSequence(new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5,
                                                                                    13, 3, 11, 7, 15}));
    }
}