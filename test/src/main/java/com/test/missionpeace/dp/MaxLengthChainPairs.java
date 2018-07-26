package com.test.missionpeace.dp;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: pavan.g
 * created: 24/07/18.
 */
public class MaxLengthChainPairs {

    private class LengthComparator implements Comparator<int[]> {

        @Override
        public int compare(int[] o1, int[] o2) {
            if (o1[1] != o2[1]) {
                return o1[1] < o2[1] ? -1 : 1;
            }
            if (o1[0] != o2[0])
                return o1[0] < o2[0] ? -1 : 1;
            return 0;
        }
    }
    public int maxLength(int[][] chains) {
        int[] dp = new int[chains.length];

        Arrays.sort(chains, new LengthComparator());
        for (int i = 0; i < chains.length; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < chains.length; i++) {
            for (int j = 0; j < i; j++) {
                if (chains[i][0] < chains[j][1]) continue;
                dp[i] = Math.max(1+dp[j], dp[i]);
            }
        }
        return dp[chains.length-1];
    }
}
