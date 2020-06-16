package com.test.googleprep;

public class CountOfIncreasingTripets {
    public int getNumberOfTriplets(int[] arr) {
        int[] duets = new int[arr.length];
        int totalCount = 0;
        for (int i = arr.length-2; i >= 0; i--) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    duets[i] += 1;
                    totalCount += duets[j];
                }
            }
        }
        return totalCount;
    }
}
