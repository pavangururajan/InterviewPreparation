package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowFunctionTest {

    @Test
    public void myPow() {
        PowFunction powFunction = new PowFunction();
        System.out.println(powFunction.myPow(2.0, Integer.MIN_VALUE));
    }
}