package com.test.facebook;

public class MinFlips {
    public int minFlips(int a, int b, int c) {
        int flips = (a|b)^c;
        int aandb = a&b;
        int count = 0;
        while (flips != 0) {
            if ((flips & 1) == 1) {
                int inc = 1;
                if ((aandb & 1) == 1) {
                    inc = 2;
                }
                count += inc;
            }
            flips = flips >> 1;
            aandb >>= 1;
        }
        return count;
    }
}
