package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfNumbersTest {

    SumOfNumbers object;
    @Before
    public void setUp() throws Exception {
        object=new SumOfNumbers();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void sumTest() {
        assertEquals(41,object.sum("12 23 2 4"));
    }
}