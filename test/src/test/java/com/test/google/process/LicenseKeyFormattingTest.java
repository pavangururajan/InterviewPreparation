package com.test.google.process;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 17/05/18.
 */
public class LicenseKeyFormattingTest {

    @Test
    public void licenseKeyFormatting() {
        LicenseKeyFormatting licenseKeyFormatting = new LicenseKeyFormatting();
        System.out.println(licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2));
        System.out.println(licenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }
}