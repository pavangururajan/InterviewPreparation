package com.test.facebook;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPoints {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(new DistanceComparator());
        PriorityQueue<Integer> min = new PriorityQueue<>(Comparator.naturalOrder());
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        for (int[] p : points) {
            queue.add(p);
            if (queue.size() > K) {
                queue.poll();
            }
        }
        int[][] result = new int[K][2];
        for (int i = K-1; i >= 0; i--) {
            int[] p = queue.poll();
            result[i][0] = p[0];
            result[i][1] = p[1];
        }
        return result;
    }

    private static class DistanceComparator implements Comparator<int[]> {
        public int compare(int[] o1, int[] o2) {
            double distance1 = Math.pow(o1[0], 2) + Math.pow(o1[1], 2);
            double distance2 = Math.pow(o2[0], 2) + Math.pow(o2[1], 2);
            return (int)(distance2-distance1);
        }
    }
}
