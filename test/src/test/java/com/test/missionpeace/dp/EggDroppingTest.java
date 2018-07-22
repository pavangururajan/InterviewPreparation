package com.test.missionpeace.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 17/07/18.
 */
public class EggDroppingTest {

    @Test
    public void minEggDrops() {
        EggDropping eggDropping =  new EggDropping();
        System.out.println(eggDropping.minEggDrops(4, 12));
    }
}