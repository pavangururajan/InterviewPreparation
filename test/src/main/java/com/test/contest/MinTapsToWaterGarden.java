package com.test.contest;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

public class MinTapsToWaterGarden {
    public int minTaps(int n, int[] ranges) {
        if (n == 0) return 0;

        List<int[]> spans = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            spans.add(new int[] {Math.max(0, i-ranges[i]), Math.min(n, i+ranges[i])});
        }
        Collections.sort(spans, new TapComparator());
        int absoluteMax = 1000000;
        int best = absoluteMax;
        int[] dp = new int[n+1];
        for (int i=0; i <=n; i++)
            dp[i] = absoluteMax;
        for (int i=0; i <= n; i++) {
            if (spans.get(i)[0] <= 0)
                dp[i] = 1;
            for (int j=i-1; j >= 0; j--) {
                if (spans.get(i)[0] <= spans.get(j)[1])
                    dp[i] = Math.min(dp[i], dp[j]+1);
            }
            if (spans.get(i)[1] >= n && dp[i] < absoluteMax) {
                best = Math.min(best, dp[i]);
            }
        }
        return best == absoluteMax ? -1 : best;
    }

    private class TapComparator  implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[0] == o2[0] ? o1[1]-o2[1] : o1[0]-o2[0];
        }
    }
}
