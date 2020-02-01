package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class UbiquitousBinarySearchTest {

    @Test
    public void getRightMost() {
        UbiquitousBinarySearch ubiquitousBinarySearch = new UbiquitousBinarySearch();
        System.out.println(ubiquitousBinarySearch.getRightMost(new int[]{1,1,2,2,4,4,6,6}, 5));
        System.out.println(ubiquitousBinarySearch.getLeftMost(new int[]{1,1,2,2,4,4,6,6}, 5));
    }
}