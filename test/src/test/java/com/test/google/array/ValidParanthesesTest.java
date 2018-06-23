package com.test.google.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 22/05/18.
 */
public class ValidParanthesesTest {

    @Test
    public void isValid() {
        ValidParantheses validParantheses = new ValidParantheses();
        System.out.println(validParantheses.isValid(""));
        System.out.println(validParantheses.isValid("]"));
        System.out.println(validParantheses.isValid("{()[]{}}"));
        System.out.println(validParantheses.isValid("{()[]{}"));
        System.out.println(validParantheses.isValid("{()]{}"));
    }
}