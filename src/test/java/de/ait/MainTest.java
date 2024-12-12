package de.ait;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testGetGreetingReturnCorrectMessage() {
        Main main = new Main();
        String result = main.getGreeting("Test");
        assertEquals("Hello, Test!", result);
    }
}
