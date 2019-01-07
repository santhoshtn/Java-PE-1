package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberCheckTest {
    NumberCheck chck;
    @Before
    public void setUp() throws Exception {
        chck=new NumberCheck();

    }

    @After
    public void tearDown() throws Exception {
        chck=null;
    }
    @Test
    public void  CheckForTom(){
        //Arrange
        long i=23;
        String expectedValue="Tom";
        //Act
        String actualValue=chck.TomOrJerry(i);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void  CheckForJerry(){
        //Arrange
        long i=24;
        String expectedValue="Jerry";
        //Act
        String actualValue=chck.TomOrJerry(i);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}

