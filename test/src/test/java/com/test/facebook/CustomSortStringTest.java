package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomSortStringTest {

    @Test
    public void customSortString() {
        CustomSortString customSortString = new CustomSortString();
        System.out.println(customSortString.customSortString("cba", "fakdcdcfgabobabcdegb"));
    }
}