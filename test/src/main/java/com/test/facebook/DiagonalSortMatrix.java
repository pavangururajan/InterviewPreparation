package com.test.facebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class DiagonalSortMatrix {
    public int[][] diagonalSort(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            List<Integer> subarray = new ArrayList<>();
            for (int j = 0; i+j < mat.length && j < mat[0].length; j++) {
                subarray.add(mat[i+j][j]);
            }
            Collections.sort(subarray);
            ListIterator<Integer> it = subarray.listIterator();
            for (int j = 0; i+j < mat.length && j < mat[0].length; j++) {
                mat[i+j][j] = it.next();
            }
        }
        for (int j = 1; j < mat[0].length; j++) {
            List<Integer> subarray = new ArrayList<>();
            for (int i = 0; i+j < mat[0].length && i < mat.length; i++) {
                subarray.add(mat[i][i+j]);
            }
            Collections.sort(subarray);
            ListIterator<Integer> it = subarray.listIterator();
            for (int i = 0; i+j < mat[0].length && i < mat.length; i++) {
                mat[i][i+j] = it.next();
            }
        }
        return mat;
    }
}
