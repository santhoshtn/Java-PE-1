package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class VowelOrConsonantTest {
    VowelOrConsonant object ;
    @Before
    public void setUp() throws Exception {
        object =new VowelOrConsonant();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void NotALetterCheck(){
        String value="123";
        boolean expectedValue= object.LetterCheck(value);
        assertFalse(expectedValue);
    }
    @Test
    public void VowelOrConsonantTest(){
        String value1="a",value2="b",value3="abc";
        String expectedValue1="a-vowel:",expectedValue2="b-consonant:",
                expectedValue3="a-vowel:b-consonant:c-consonant:";
        String actualValue1=object.VowelOrConsonant(value1);
        String actualValue2=object.VowelOrConsonant(value2);
        String actualValue3=object.VowelOrConsonant(value3);
        assertEquals(expectedValue1,actualValue1);
        assertEquals(expectedValue2,actualValue2);
        assertEquals(expectedValue3,actualValue3);
    }


}