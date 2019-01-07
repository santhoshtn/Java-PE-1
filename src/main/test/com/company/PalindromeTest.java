package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {
    Palindrome pal;
    @Before
    public void setUp() throws Exception {
        pal= new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        pal=null;
    }
    @Test
    public void PalindromeWithNumGT25Test(){
        //Arrange
        long i=2468642;
        String expectedValue="Is palindrome and sum of even number is greater than 25";
        //Act
        String actualValue=pal.palindrome(i);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void PalindromeWithNumLT25Test(){
        //Arrange
        long i=1234554321;
        String expectedValue="Is palindrome and sum of even number is less than 25";
        //Act
        String actualValue=pal.palindrome(i);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void NotAPalindromeTest(){
        //Arrange
        long i=12345;
        String expectedValue="Not a palindrome";
        //Act
        String actualValue=pal.palindrome(i);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}