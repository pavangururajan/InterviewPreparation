package com.test.missionpeace.dp;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.geeksforgeeks.org/weighted-job-scheduling/
 * @author: pavan.g
 * created: 24/07/18.
 */
public class WeightedJobScheduling {
    public static class Job {
        int start;
        int end;
        int profit;

        public Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    private class JobComparator implements Comparator<Job> {

        @Override
        public int compare(Job o1, Job o2) {
            if (o1.end != o2.end) {
                return o1.end < o2.end ? -1 : 1;
            }
            if (o1.start != o2.start) {
                return o1.start < o2.start ? -1 : 1;
            }
            return 0;
        }
    }

    public int maxProfit(Job[] jobs) {
        int dp[] = new int[jobs.length];
        Arrays.sort(jobs, new JobComparator());

        for (int i = 0; i < jobs.length; i++) {
            dp[i] = jobs[i].profit;
        }

        for (int i = 1; i < jobs.length; i++) {
            for (int j = 0; j < i; j++) {
                if (jobs[i].start < jobs[j].end) continue;
                dp[i] += dp[j];
            }
        }
        return dp[jobs.length-1];
    }
}
