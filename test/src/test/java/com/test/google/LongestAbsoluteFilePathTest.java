package com.test.google;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 30/06/18.
 */
public class LongestAbsoluteFilePathTest {

    @Test
    public void lengthLongestPath() {
        LongestAbsoluteFilePath longestAbsoluteFilePath = new LongestAbsoluteFilePath();
        int length = longestAbsoluteFilePath.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext");
        length = longestAbsoluteFilePath.lengthLongestPath("dir\n\tfile.ext");
        System.out.println(length);
    }
}