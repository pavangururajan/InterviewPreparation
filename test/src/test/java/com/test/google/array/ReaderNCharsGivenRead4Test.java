package com.test.google.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 18/05/18.
 */
public class ReaderNCharsGivenRead4Test {

    @Test
    public void read() {
        int n = 2;
        char[] buffer = new char[n];
        ReaderNCharsGivenRead4 readerNCharsGivenRead4 =  new ReaderNCharsGivenRead4();
        readerNCharsGivenRead4.read(buffer, n);
        System.out.println(Arrays.toString(buffer));
    }
}