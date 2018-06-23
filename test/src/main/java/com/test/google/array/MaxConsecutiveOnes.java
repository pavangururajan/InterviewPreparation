package com.test.google.array;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author: pavan.g
 * created: 22/05/18.
 */
public class MaxConsecutiveOnes {
    private int id;
    private String name;
    private char[] email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MaxConsecutiveOnes)) return false;
        MaxConsecutiveOnes that = (MaxConsecutiveOnes) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Arrays.equals(email, that.email);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(id, name);
        result = 31 * result + Arrays.hashCode(email);
        return result;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                current = 0;
            }
            current += nums[i];
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}
