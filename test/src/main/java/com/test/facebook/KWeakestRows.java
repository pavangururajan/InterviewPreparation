package com.test.facebook;

public class KWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) return null;
        boolean[] added = new boolean[mat.length];
        int[] weakRows = new int[k];
        int r = 0;
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = mat.length-1; j >= 0; j--) {
                if (added[j]) continue;
                if (mat[j][i] == 0) {
                    weakRows[r] = j;
                    r++;
                    added[j] = true;
                    if (r > k) {
                        return weakRows;
                    }
                }
            }
        }
        for (int j = mat.length-1; j >= 0; j--) {
            if (added[j]) continue;
            weakRows[r++] = j;
            if (r > k) {
                return weakRows;
            }
        }
        return weakRows;
    }
}
