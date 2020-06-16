package com.test.facebook;

public class RollingSubarrayAverage {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if (arr.length < k) return 0;
        double average = 0;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        average = sum/k;
        int count = 0;
        if (average >= threshold) count++;
        int i = 1;
        while (i + k <= arr.length) {
            sum += (arr[i+k-1] - arr[i-1]);
            average = sum/k;
            if (average >= threshold) count++;
            i++;
        }
        return count;
    }
}
