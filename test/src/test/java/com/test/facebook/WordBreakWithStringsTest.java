package com.test.facebook;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class WordBreakWithStringsTest {

    @Test
    public void wordBreak() {
        WordBreakWithStrings wordBreakWithStrings = new WordBreakWithStrings();
        List<String> result = wordBreakWithStrings.wordBreak("ihavesamsung", Arrays.asList("i", "havesam", "have", "sam", "sung", "samsung"));
        System.out.println(Arrays.toString(result.toArray()));
    }
}