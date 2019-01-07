package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalSmallDigitSpecialTest {

    CapitalSmallDigitSpecial obj;
    @Before
    public void setUp() throws Exception {
        obj=new CapitalSmallDigitSpecial();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void checkUppercaseTest () {
        assertEquals("Capital letter",obj.check('A'));
    }

    @Test
    public void checkLowercaseTest() {
        assertEquals("Lower case letter",obj.check('a'));
    }

    @Test
    public void checkDigitTest() {
        assertEquals("Digit",obj.check('1'));
    }

    @Test
    public void checkSpecialCharacterTest() {
        assertEquals("Special Character",obj.check('@'));
    }
}