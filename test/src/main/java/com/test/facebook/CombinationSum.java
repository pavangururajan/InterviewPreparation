package com.test.facebook;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] A, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(A, sum, result, temp, 0);
        return result;
    }

    private void helper(int[] A, int sum, List<List<Integer>> result, List<Integer> tempList, int start) {
        if (sum < 0) {
            return;
        } else if (sum == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        } else {
            for (int i=start; i < A.length; i++) {
                tempList.add(A[i]);
                helper(A, sum-A[i], result, tempList, i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
