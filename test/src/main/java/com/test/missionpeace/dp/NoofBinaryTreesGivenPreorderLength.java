package com.test.missionpeace.dp;

/**
 * @author: pavan.g
 * created: 15/07/18.
 */
public class NoofBinaryTreesGivenPreorderLength {
    public int numBinaryTrees(int length) {
        int[] numBinaryTrees = new int[length+1];
        numBinaryTrees[0] = numBinaryTrees[1] = 1;
        for (int i = 2; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                numBinaryTrees[i] += numBinaryTrees[j] * numBinaryTrees[i-j-1];
            }
        }
        return numBinaryTrees[length];
    }
}
