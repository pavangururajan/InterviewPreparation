package com.test.googleprep;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountOfIncreasingTripetsTest {

    @Test
    public void getNumberOfTriplets() {
        CountOfIncreasingTripets obj = new CountOfIncreasingTripets();
        int[] array = new int[] {5,4,3,2,1};
        System.out.println(obj.getNumberOfTriplets(array));
    }
}