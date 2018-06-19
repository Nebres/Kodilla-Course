package com.kodilla.testing.forum.statistics.

import com.kodilla.testing.forum.statistics;


import org.junit.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCounterSuiteTest {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test

    public void testStatisticsCounter() {

        StatisticsStub stub = mock(StatisticsStub.class);

    }
}
