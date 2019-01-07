package com.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class TopKFrequentElementsTest {

    @Test
    public void topKFrequent() {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] nums = {1, 4, 1, 2, 3, 1, 5, 2, 3, 7, 9, 3, 2, 3};
        System.out.println(topKFrequentElements.topKFrequent(nums, 0));
    }
}