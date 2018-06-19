package com.kodilla.testing.collection;


import com.kodilla.testing.TestingMain;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: Begin of odd Number Exterminator test");
    }

    @After
    public void after(){
        System.out.println("Test Case: end of odd Number Exterminator test");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: Begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        //Given
        ArrayList<Integer> list = new ArrayList<>();
        //When
        List<Integer> resultList = new OddNumbersExterminator().exterminate(list);
        //Then
        Assert.assertEquals(list, resultList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> list = TestingMain.initNumbers();
        ArrayList<Integer> resultList = new OddNumbersExterminator().exterminate(list);
        //When
        boolean evenValidator = new OddNumbersExterminator().isEven(resultList);
       //Then
        Assert.assertEquals(true, evenValidator);
    }

}
