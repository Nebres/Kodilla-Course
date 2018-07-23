package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLog() {
        //Given
        Logger logger = Logger.getInstance();
        logger.log("First Log");
        String expected = "First Log";
        //When
        String actual = logger.getLastLog();
        //Than
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = Logger.getInstance();
        String expected = "First Log";
        //When
        String actual = logger.getLastLog();
        //Than
        Assert.assertEquals(expected, actual);
    }

}
