package com.test.facebook;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReduceArrayToHalf {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int a : arr) {
            freq.put(a, freq.getOrDefault(a, 0) + 1);
        }
        PriorityQueue<Number> priorityQueue = new PriorityQueue<>(new NumberComparator());
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            Number n = new Number(entry.getKey(), entry.getValue());
            priorityQueue.add(n);
        }
        int sum = 0;
        int count = 0;
        while (!priorityQueue.isEmpty() && sum < Math.ceil((float)arr.length/2)) {
            sum += priorityQueue.poll().frequency;
            count++;
        }
        return count;
    }

    private static class Number {
        public int i;
        public int frequency;

        public Number(int i, int frequency) {
            this.i = i;
            this.frequency = frequency;
        }
    }

    public static class NumberComparator implements Comparator<Number> {
        @Override
        public int compare(Number o1, Number o2) {
            return o2.frequency - o1.frequency;
        }
    }
}
