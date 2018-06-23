package com.test.google.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 21/05/18.
 */
public class isPalindromeTest {

    @Test
    public void isPalindrome() {
        isPalindrome isPalindrome = new isPalindrome();
        System.out.println(isPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome.isPalindrome("a "));
        System.out.println(isPalindrome.isPalindrome(" "));
        System.out.println(isPalindrome.isPalindrome("a,aaa"));
    }
}