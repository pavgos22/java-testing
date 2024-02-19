package com.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        Logger logger = Logger.getInstance();

        logger.log("Test log");

        assertEquals("Test log", logger.getLastLog());
    }
}
