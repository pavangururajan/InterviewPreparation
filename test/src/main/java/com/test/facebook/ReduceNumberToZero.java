package com.test.facebook;

public class ReduceNumberToZero {
    public int numberOfSteps (int num) {
        if (num <= 0) return 0;
        int count = 0;
        int n = num;
        while (n != 0) {
            if (n % 2 == 0)
                n = n/2;
            else
                n = n-1;
            count++;
        }
        return count;
    }
}
