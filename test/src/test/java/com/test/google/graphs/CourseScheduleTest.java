package com.test.google.graphs;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.json.*;

/**
 * @author: pavan.g
 * created: 26/05/18.
 */
public class CourseScheduleTest {

    @Test
    public void canFinish() {
        int a = 2147483647;
        System.out.println(a < Long.MAX_VALUE);
        String ab = "pavan";
        List<String> l = new ArrayList<>();
    }

    @Test
    public void testEmptySpaceRemoval() {
        String logString = "th         is\n" +
                            "i   s\n" +
                            "so   me\n" +
                            "log";
        System.out.println(logString.replaceAll("\\s", ""));
        String json = "{\"name\": \"pavan\", \"skill\" : [\"skill1\"]}";
        JSONObject jsonObject = new JSONObject(json);
        System.out.println(jsonObject.toString());
        List<Integer> [] a;
        Map<String, String> amap = Maps.newHashMap();
        amap.getOrDefault("a", null);
        Stack<String> stack = new Stack<>();
    }
}