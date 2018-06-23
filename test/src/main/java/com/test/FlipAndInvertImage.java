package com.test;

import java.util.BitSet;

/**
 * @author: pavan.g
 * created: 13/05/18.
 */
public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length ; i++) {
            int[] iArray = A[i];
            int[] newArray = new int[iArray.length];
            int k = 0;
            for (int j = iArray.length-1; j >= 0; j--) {
                newArray[k] = iArray[j] == 0 ? 1 : 0;
                k++;
            }
            result[i] = newArray;
        }
        return result;
    }
}
