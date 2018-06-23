package com.test.google.process;

import java.util.TreeSet;

/**
 * @author: pavan.g
 * created: 15/05/18.
 */
public class KEmptySlots {
    public int kEmptySlots(int[] flowers, int k) {
        for (int i = 1; i < flowers.length; i++) {
            int j = binarySearch(flowers[i], flowers, 0, i);
            for (; j > 0; j--) {
                if (flowers[j] < flowers[j - 1]) {
                    int temp = flowers[j - 1];
                    flowers[j - 1] = flowers[j];
                    flowers[j] = temp;
                } else {

                    break;
                }
            }
            int difference;
            if (j > 0) {
                difference = Math.abs(flowers[j] - flowers[j - 1]);
                if (difference == (k + 1)) {
                    return i + 1;
                }
            }
            if (j + 1 <= i) {
                difference = Math.abs(flowers[j] - flowers[j + 1]);
                if (difference == (k + 1)) {
                    return i + 1;
                }
            }
        }
        return -1;
    }

    private int binarySearch(int searchKey, int[] array, int start, int end) {
        int index = (start + end) / 2;
        while (true) {
            if (searchKey >= array[index]) {
                if (index + 1 > end) {
                    return index;
                }
                if (searchKey < array[index + 1]) {
                    return index + 1;
                }
                return binarySearch(searchKey, array, index + 1, end);
            }
            if (searchKey <= array[index]) {
                if (index - 1 < start) {
                    return index;
                }
                if (searchKey > array[index - 1]) {
                    return index;
                }
                return binarySearch(searchKey, array, start, index - 1);
            }
        }
    }

    public int kEmptySlotsSolution1(int[] flowers, int k) {
        for (int i = 1; i < flowers.length; i++) {
            int j = i;
            for (; j > 0; j--) {
                if (flowers[j] < flowers[j - 1]) {
                    int temp = flowers[j - 1];
                    flowers[j - 1] = flowers[j];
                    flowers[j] = temp;
                } else {

                    break;
                }
            }
            int difference;
            if (j > 0) {
                difference = Math.abs(flowers[j] - flowers[j - 1]);
                if (difference == (k + 1)) {
                    return i + 1;
                }
            }
            if (j + 1 <= i) {
                difference = Math.abs(flowers[j] - flowers[j + 1]);
                if (difference == (k + 1)) {
                    return i + 1;
                }
            }
        }
        return -1;
    }

    public int kEmptySlotsSolution2(int[] flowers, int k) {
        TreeSet<Integer> sortedPositions = new TreeSet<Integer>();
        for (int i = 0; i < flowers.length; i++) {
            sortedPositions.add(flowers[i]);
            Integer lower = sortedPositions.lower(flowers[i]);
            if (lower != null && (flowers[i] - lower == k + 1)) {
                return i+1;
            }
            Integer higher = sortedPositions.higher(flowers[i]);
            if (higher != null && (higher - flowers[i] == k+1)) {
                return i+1;
            }
        }
        return -1;
    }
}

