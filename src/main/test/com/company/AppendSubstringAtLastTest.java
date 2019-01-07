package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppendSubstringAtLastTest {

    AppendSubstringAtLast object;
    @Before
    public void setUp() throws Exception {
        object=new AppendSubstringAtLast();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void generateAtLastTest() {
        assertEquals("Stackroutetete",object.generateAtLast(2,"Stackroute"));
    }
}