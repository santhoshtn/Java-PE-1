package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortNumbersTest {

    SortNumbers object;
    @Before
    public void setUp() throws Exception {
        object=new SortNumbers();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }



    @Test
    public void sortNumbersTest() {
        assertEquals("544332",object.sortNumbers(234534));
    }

    @Test
    public void addTest() {
        assertEquals(10,object.add(234534));
    }

    @Test
    public void checkTest() {
        assertEquals(false,object.check(234534));
    }
}