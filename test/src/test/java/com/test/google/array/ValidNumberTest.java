package com.test.google.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 22/05/18.
 */
public class ValidNumberTest {

    @Test
    public void isNumber() {
        ValidNumber validNumber = new ValidNumber();
        System.out.println(validNumber.isNumber("-."));
        System.out.println(validNumber.isNumber("3."));
        System.out.println(validNumber.isNumber(".1"));
        System.out.println(validNumber.isNumber("-0x123e32"));
        System.out.println(validNumber.isNumber("-1234"));
        System.out.println(validNumber.isNumber(" +1234 "));
        System.out.println(validNumber.isNumber(" +12 34 "));
        System.out.println(validNumber.isNumber("-0x123e-32"));
        System.out.println(validNumber.isNumber("0e1"));
        System.out.println(validNumber.isNumber("0e"));
    }
}