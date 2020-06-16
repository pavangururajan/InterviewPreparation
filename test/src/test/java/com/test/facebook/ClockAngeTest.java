package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClockAngeTest {

    @Test
    public void angleClock() {
        ClockAnge clockAnge =  new ClockAnge();
        System.out.println(clockAnge.angleClock(12, 0));
    }
}