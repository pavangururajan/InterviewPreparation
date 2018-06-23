package com.test.google.array;

/**
 * @author: pavan.g
 * created: 18/05/18.
 */
public class Reader4 {
    public static char[] input = {'a'};
    int pointer = 0;
    int length = 0;
    int read4(char[] buf) {
        for (int i = 0; i < 4 && i < input.length; i++) {
            length++;
            buf[i] = input[pointer];
            pointer++;
        }
        return length;
    }
}
