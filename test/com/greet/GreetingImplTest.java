/**
 * @(#) $Id: eRTJalopyCodeConventions.xml 1657 2007-06-12 14:55:27Z worourke $
 * Copyright (c) 2010 eResearchTechnology, Inc. All Rights Reserved.
 */

package com.greet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingImplTest {
    private Greeting greeting;

    @BeforeEach void beforeEach() {
        greeting = new GreetingImpl();
    }


    @AfterEach void afterEach() {
        // this is not required to set to null, just to demonstrate reardown
        greeting = null;
    }


    @BeforeAll static void beforeClass() {}


    @AfterAll static void afterClass() {}


    @Test void greetShouldReturnValidOutput() {
        String result = greeting.greet("Junit");

        assertNotNull(result);
        assertEquals("Hello Junit!", result);
    }


    @Test void greetingShouldIllegalArgForNull() {
        assertNotNull(assertThrows(IllegalArgumentException.class, () -> greeting.greet(null)));
    }


    @Test void greetingShouldIllegalArgForBlank() {
        assertNotNull(assertThrows(IllegalArgumentException.class, () -> greeting.greet("")));
    }
}