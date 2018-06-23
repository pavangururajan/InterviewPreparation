package com.test.google.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 18/05/18.
 */
public class LengthOfLongestSubstringKDistinctTest {

    @Test
    public void lengthOfLongestSubstringKDistinct() {
        String s = "abaccc";
        LengthOfLongestSubstringKDistinct lengthOfLongestSubstringKDistinct = new LengthOfLongestSubstringKDistinct();
        System.out.println(lengthOfLongestSubstringKDistinct.lengthOfLongestSubstringKDistinct(s, 2));
    }
}