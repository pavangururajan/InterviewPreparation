package com.test.facebook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, Comparator.reverseOrder());
        int[] result = new int[nums.length-k+1];
        int i = 0;
        for (; i < nums.length; i++) {
            if (i < k) {
                queue.add(nums[i]);
            } else {
                result[i-k] = queue.peek();
                queue.remove(nums[i-k]);
                queue.add(nums[i]);
            }
        }
        result[i-k] = queue.peek();
        return result;
    }
}
