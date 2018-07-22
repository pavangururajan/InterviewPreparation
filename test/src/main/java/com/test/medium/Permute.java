package com.test.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: pavan.g
 * created: 10/07/18.
 */
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), nums);
        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                helper(result, tempList, nums);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
