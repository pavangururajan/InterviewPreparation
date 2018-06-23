package com.test.google.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: pavan.g
 * created: 22/05/18.
 */
public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> result = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        int[] resultArray = new int[result.size()];
        Iterator<Integer> it = result.iterator();
        for (int i = 0; i < result.size(); i++){
            resultArray[i] = it.next();
        }
        return resultArray;
    }
}
