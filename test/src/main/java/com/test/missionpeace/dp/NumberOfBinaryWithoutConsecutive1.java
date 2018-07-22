package com.test.missionpeace.dp;

/**
 * @author: pavan.g
 * created: 15/07/18.
 */
public class NumberOfBinaryWithoutConsecutive1 {
    public int findIntegers(int num) {
        int[] ending0 = new int[num+1];
        int[] ending1 = new int[num+1];
        ending0[1] = 1;
        ending1[1] = 1;
        for (int i = 2; i <= num; i++) {
            ending0[i] = ending0[i-1] + ending1[i-1];
            ending1[i] = ending0[i-1];
        }
        return ending0[num] + ending1[num];
    }
}
