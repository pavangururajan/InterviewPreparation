package com.test;

import java.util.Arrays;

/**
 * @author: pavan.g
 * created: 11/06/18.
 */
public class MaxDistanceToClosest {
    public int maxDistToClosest(int[] seats) {
        int[] left = new int[seats.length];
        int[] right = new int[seats.length];
        int counter = -1;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                counter = 0;
                left[i] = counter;
            } else {
                if (counter >= 0) {
                    left[i] = ++counter;
                } else {
                    left[i] = counter;
                }
            }
        }
        counter = -1;
        for (int i = seats.length - 1; i >= 0; i--) {
            if (seats[i] == 1) {
                counter = 0;
                right[i] = counter;
            } else {
                if (counter >= 0) {
                    right[i] = ++counter;
                } else {
                    right[i] = counter;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                continue;
            }
            int l = left[i] == -1 ? right[i] : left[i];
            int r = right[i] == -1 ? left[i] : right[i];
            int dist = Math.min(l, r);
            if (dist == -1) {
                return 0;
            }
            if (dist > max) {
                max = dist;
            }
        }
        return max;
    }
}
