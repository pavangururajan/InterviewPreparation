package com.test.missionpeace.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 24/07/18.
 */
public class WeightedJobSchedulingTest {

    @Test
    public void maxProfit() {
        int[][] jobs = {{3, 10, 20}, {1, 2, 50}, {6, 19, 100}, {2, 100, 200}};
        WeightedJobScheduling.Job[] jobs1 = new WeightedJobScheduling.Job[jobs.length];
        for (int i = 0; i < jobs.length; i++) {
            WeightedJobScheduling.Job j = new WeightedJobScheduling.Job(jobs[i][0], jobs[i][1], jobs[i][2]);
            jobs1[i] = j;
        }
        WeightedJobScheduling weightedJobScheduling = new WeightedJobScheduling();
        System.out.println(weightedJobScheduling.maxProfit(jobs1));
    }
}