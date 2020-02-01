package com.test.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class VerticalStringTest {

    @Test
    public void printVertically() {
        VerticalString verticalString = new VerticalString();
        System.out.println(verticalString.printVertically("TOP BE OR NO TO BE"));
    }
}