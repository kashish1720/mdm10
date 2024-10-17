package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GoogleSearchTest extends TestCase {

    // Constructor name corrected to match the class name
    public GoogleSearchTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        // Corrected to reference the current class
        return new TestSuite(GoogleSearchTest.class);
    }

    public void testApp() {
        assertTrue(true);
    }
}
