package com.test.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 05/07/18.
 */
public class ZigZagConversionTest {

    @Test
    public void convert() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        System.out.println(zigZagConversion.convert("AB", 1));
    }
}