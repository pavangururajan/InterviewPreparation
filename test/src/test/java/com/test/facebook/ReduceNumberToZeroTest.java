package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReduceNumberToZeroTest {

    @Test
    public void numberOfSteps() {
        ReduceNumberToZero reduceNumberToZero = new ReduceNumberToZero();
        System.out.println(reduceNumberToZero.numberOfSteps(8));
    }
}