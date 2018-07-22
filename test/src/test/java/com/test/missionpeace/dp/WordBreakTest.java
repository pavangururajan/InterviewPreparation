package com.test.missionpeace.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 15/07/18.
 */
public class WordBreakTest {

    @Test
    public void wordBreak() {
        WordBreak wordBreak = new WordBreak();
        System.out.println(wordBreak.wordBreak(new String[]{"i", "love", "flip", "flikart"}, "iloveflipkart"));
    }
}