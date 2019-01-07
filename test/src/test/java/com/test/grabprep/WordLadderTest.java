package com.test.grabprep;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WordLadderTest {

    @Test
    public void ladderLength() {
        WordLadder wordLadder = new WordLadder();
        List<String>  words = new ArrayList<>();
        String[] wordArray = new String[] {"hot","dot","dog","lot","log","cog"};
        for (String w : wordArray) {
            words.add(w);
        }
        System.out.println(wordLadder.ladderLength("hit", "cog", words));
    }
}