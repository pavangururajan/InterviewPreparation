package com.test.google.others;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 31/05/18.
 */
public class UTF8ValidationTest {

    @Test
    public void validUtf8() {
        UTF8Validation solution = new UTF8Validation();
        //System.out.println(solution.validUtf8(new int[]{145}));
//        System.out.println(solution.validUtf8(new int[]{197, 130, 1}));
        //System.out.println(solution.validUtf8(new int[]{235, 140, 4}));
        System.out.println(solution.validUtf8(new int[]{39,89,227,83,132,95,10,0}));
    }
}