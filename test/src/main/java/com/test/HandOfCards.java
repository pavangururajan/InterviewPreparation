package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author: pavan.g
 * created: 05/06/18.
 */
public class HandOfCards {
    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) {
            return false;
        }
        int n = hand.length;
        int[] h = hand.clone();
        Arrays.sort(h);
        Set<Integer> H = new TreeSet<>();
        Map<Integer, Integer> F = new HashMap<>();
        for (int i = 0; i < n; i++) {
            H.add(h[i]);
            int count = F.getOrDefault(h[i], 0);
            F.put(h[i], count+1);
        }
        int[] A = new int[H.size()];
        Iterator<Integer> iterator = H.iterator();
        for (int i = 0; i < A.length; i++) {
            A[i] = iterator.next();
        }
        n = A.length;
        System.out.println(Arrays.toString(A));
        int l = 0;
        for (int i = 0; countRemaining(F, A, i, n) >= W; i = next(F, A, i, n)) {
            System.out.println("Next i: " + i + " value: " + A[i]);
            int c = F.get(A[i]);
            F.put(A[i], c-1);
            int j = i+1;
            for (; j < n && j < i+W; j++) {
                System.out.println("Comparing: " + A[j] + " " + A[j-1]);
                if (A[j] != 1+A[j-1] || F.get(A[j]) < 0) {
                    return false;
                }
                int count = F.get(A[j]);
                F.put(A[j], count-1);
            }
            if (j - i != W) {
                return false;
            }
            System.out.println(F);
            System.out.println("Next i: " + next(F,A,i,n) + " check: " + (n-W));
        }
        return true;
    }
    private int next(Map<Integer, Integer> F, int[] A, int i, int length) {
        while (i < length && F.get(A[i]) <= 0) i++;
        return i;
    }
    private int countRemaining(Map<Integer, Integer> F, int[] A, int i, int length) {
        int count = 0;
        while (i < length) {
            count += F.get(A[i]);
            i++;
        }
        return count;
    }
}
