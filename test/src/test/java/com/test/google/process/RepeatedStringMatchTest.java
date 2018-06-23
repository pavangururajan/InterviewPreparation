package com.test.google.process;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 14/05/18.
 */
public class RepeatedStringMatchTest {

    @Test
    public void repeatedStringMatch() {
        RepeatedStringMatch repeatedStringMatch = new RepeatedStringMatch();
        System.out.println(repeatedStringMatch.repeatedStringMatch("axaxaya", "axaya"));
    }
}