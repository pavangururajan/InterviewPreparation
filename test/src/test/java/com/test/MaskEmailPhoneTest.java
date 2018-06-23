package com.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 09/05/18.
 */
public class MaskEmailPhoneTest {

    @Test
    public void maskPII() {
        MaskEmailPhone maskEmailPhone = new MaskEmailPhone();
        String output = maskEmailPhone.maskPII("LeetCode@Leetcode.com");
        System.out.println(output);
    }

    @Test
    public void division() {
        float divisor = 2;
        System.out.println(7/divisor);
    }
}