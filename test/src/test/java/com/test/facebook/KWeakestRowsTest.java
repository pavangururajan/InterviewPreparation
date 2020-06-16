package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class KWeakestRowsTest {

    @Test
    public void kWeakestRows() {
        KWeakestRows kWeakestRows = new KWeakestRows();
        kWeakestRows.kWeakestRows(new int[][]{{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}}, 3);
    }
}