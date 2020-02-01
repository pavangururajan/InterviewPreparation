package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegexMatchingTest {

    @Test
    public void isMatch() {
        RegexMatching regexMatching = new RegexMatching();
        System.out.println(regexMatching.isMatch("aabcda", "a*b.d.*"));
    }
}