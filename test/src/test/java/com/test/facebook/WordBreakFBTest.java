package com.test.facebook;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class WordBreakFBTest {

    @Test
    public void wordBreak() {
        WordBreak wordBreak = new WordBreak();
        System.out.println(wordBreak.wordBreak("aaaaaa", Arrays.asList(new String[]{"a"})));
    }
}