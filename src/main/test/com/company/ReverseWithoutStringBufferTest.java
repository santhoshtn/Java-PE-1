package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWithoutStringBufferTest {

    ReverseWithoutStringBuffer object;
    @Before
    public void setUp() throws Exception {

         object=new ReverseWithoutStringBuffer();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseStringTest() {

        assertEquals("cba",object.reverseString("abc"));
    }
}