package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddBoldTagTest {

    @Test
    public void addBoldTag() {
        AddBoldTag obj = new AddBoldTag();
        System.out.println(obj.addBoldTag("bbcdefgaaabbccdeddecbc", new String[] {"aaa","aab","bc"}));
    }
}