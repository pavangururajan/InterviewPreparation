package com.test.geeksforgeeks.top20dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 30/06/18.
 */
public class PartitionArrayWithMinSumDiffTest {

    @Test
    public void minSumDiff() {
        PartitionArrayWithMinSumDiff partitionArrayWithMinSumDiff = new PartitionArrayWithMinSumDiff();
        System.out.println(partitionArrayWithMinSumDiff.minSumDiff(new int[] {1,4,6,9,11}));
    }
}