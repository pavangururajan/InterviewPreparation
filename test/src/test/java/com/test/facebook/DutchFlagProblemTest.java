package com.test.facebook;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DutchFlagProblemTest {

    @Test
    public void sortColors() {
        DutchFlagProblem dutchFlagProblem = new DutchFlagProblem();
        int[] nums = {2,0,2,1,1,0};
        dutchFlagProblem.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}