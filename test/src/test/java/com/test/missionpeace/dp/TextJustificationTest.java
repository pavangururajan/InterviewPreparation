package com.test.missionpeace.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 14/07/18.
 */
public class TextJustificationTest {

    @Test
    public void fullJustify() {
        TextJustification textJustification = new TextJustification();
        System.out.println(textJustification.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));
    }
}