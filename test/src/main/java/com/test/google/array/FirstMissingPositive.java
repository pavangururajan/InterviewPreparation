package com.test.google.array;

import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.List;
import java.util.Queue;

/**
 * @author: pavan.g
 * created: 23/05/18.
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        BitSet bitSet = new BitSet(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 1) {
                continue;
            }
            bitSet.set(nums[i] - 1);
        }
        Queue<Character> queue = new ArrayDeque<>();

        return bitSet.nextClearBit(0);
    }
}
