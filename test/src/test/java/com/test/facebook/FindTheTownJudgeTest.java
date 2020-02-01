package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheTownJudgeTest {

    @Test
    public void findJudge() {
        FindTheTownJudge obj = new FindTheTownJudge();
        System.out.println(obj.findJudge(2, new int[][]{{1,2}}));
    }
}