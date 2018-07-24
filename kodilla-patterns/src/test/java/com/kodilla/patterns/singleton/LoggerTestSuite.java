package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLog() {
        //Given
        Logger logger = Logger.getInstance();
        //When
        logger.log("First Log");
    }

    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = Logger.getInstance();
        String expected = "";
        //When
        String actual = logger.getLastLog();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
