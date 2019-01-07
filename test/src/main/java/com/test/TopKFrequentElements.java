package com.test;


import java.util.*;

// https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        if (nums == null || k < 1) return new ArrayList<>();
        HashMap<Integer, Frequency> frequencies = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Frequency frequency = new Frequency(nums[i], 0);
            if (frequencies.get(nums[i]) != null) {
                frequency = frequencies.get(nums[i]);
            }
            frequency.increment();
            frequencies.put(nums[i], frequency);
        }
        PriorityQueue<Frequency> priorityQueue = new PriorityQueue<>(new FrequencyComparator());

        for (Frequency frequency : frequencies.values()) {
            if (priorityQueue.size() >= k) {
                if (priorityQueue.peek().getFrequency() < frequency.getFrequency()) {
                    priorityQueue.poll();
                    priorityQueue.add(frequency);
                }
            } else {
                priorityQueue.add(frequency);
            }
        }

        List<Integer> result = new ArrayList<>();
        while (priorityQueue.size() != 0) {
            result.add(priorityQueue.poll().getNumber());
        }
        Collections.reverse(result);
        return result;
    }

    private class FrequencyComparator implements Comparator<Frequency> {
        @Override
        public int compare(Frequency o1, Frequency o2) {
            return o1.getFrequency() - o2.getFrequency();
        }
    }

    public static class Frequency {
        private int number;
        private int frequency;
        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getFrequency() {
            return frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        public void increment() {
            this.frequency += 1;
        }

        public Frequency(int number, int frequency) {
            this.number = number;
            this.frequency = frequency;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Frequency)) return false;
            Frequency frequency = (Frequency) o;
            return getNumber() == frequency.getNumber();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getNumber());
        }

        public String toString() {
            return String.format("%d: %d", this.number, this.frequency);
        }
    }
}
