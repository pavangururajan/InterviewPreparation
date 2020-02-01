package com.test.facebook;

public class UbiquitousBinarySearch {

    public int getRightMost(int[] A, int target) {
        return getRightMostBS(A, 0, A.length-1, target);
    }

    private int getRightMostBS(int[] A, int start, int end, int target) {
        int mid;
        while (end - start > 1) {
            mid = (start+end)/2;
            if (A[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public int getLeftMost(int[] A, int target) {
        return getLeftMostBS(A, 0, A.length-1, target);
    }

    private int getLeftMostBS(int[] A, int start, int end, int target) {
        int mid;
        while (end - start > 1) {
            mid = (start+end)/2;
            if (A[mid] >= target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        return end;
    }
}