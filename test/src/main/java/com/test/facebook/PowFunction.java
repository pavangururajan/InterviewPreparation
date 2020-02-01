package com.test.facebook;

import java.util.ArrayList;
import java.util.List;

public class PowFunction {
    public double myPow(double x, int n) {
        if (n == 0) return 1;

        boolean negPower = n < 0;
        long number = Math.abs((long) n);

        double[] twoPowers = new double[40];
        twoPowers[0] = x;
        double answer = 1;
        int i = 0;
        while (number > 0) {
            if ((number & 1) == 1) {
               answer *= twoPowers[i];
            }
            number >>= 1;
            i++;
            twoPowers[i] = twoPowers[i-1] * twoPowers[i-1];
        }

        if (negPower) answer = 1/answer;
        return answer;
    }
}
