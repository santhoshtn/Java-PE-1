package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoopTillNthTermTest {

    LoopTillNthTerm object ;
    @Before
    public void setUp() throws Exception {
        object= new LoopTillNthTerm();

    }

    @After
    public void tearDown() throws Exception {
    object=null;
    }

    @Test
    public void LoopTillNTestCheck(){
        long value=5;
        String expectedValue="122333444455555";
        String actualValue=object.LoopTillNthTerm(value);
        assertEquals(expectedValue,actualValue);
    }
}

