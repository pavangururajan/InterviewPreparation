package com.test.facebook;

import java.util.Arrays;
import java.util.Comparator;

public class ArrowsAndBallons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new IntervalComparator());
        int minEnd = Integer.MAX_VALUE;
        int count = 0;

        for (int[] point : points) {
            if (point[0] <= minEnd) {
                minEnd = Math.min(minEnd, point[1]);
            } else {
                count++;
                minEnd = point[1];
            }
        }
        return count + (points.length != 0 ? 1 : 0);
    }

    private static class IntervalComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[0] != o2[0] ? o1[0]-o2[0] : o1[1] - o2[1];
        }
    }
}
