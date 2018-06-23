package com.test.google.process;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 15/05/18.
 */
public class KEmptySlotsTest {

    @Test
    public void kEmptySlots() {
        KEmptySlots kEmptySlots = new KEmptySlots();
        System.out.println(kEmptySlots.kEmptySlots(new int[]{1,3,2}, 1));
    }
}