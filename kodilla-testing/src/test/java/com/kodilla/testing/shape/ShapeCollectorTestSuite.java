package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: Begin of Shape Collector Test");
    }

    @After
    public void after(){
        System.out.println("Test Case: End of Shape Collector Test");
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
    public void testAddFigure() {

        //Given
        Shape testShape = new Square(4);
        List<Shape> testList = new ArrayList<Shape>();
        //When
        testList.add(testShape);
        //Then
        Assert.assertEquals(testList.get(testList.size() - 1), testShape);
    }

    @Test
    public void testRemoveFigure() {

        //Given
        Shape testShape = new Square(4);
        List<Shape> testList = new ArrayList<Shape>();
        testList.add(0,testShape);

        //When
        testList.remove(0);

        //Then
        Assert.assertNotEquals(testList.get(0), testShape);
    }

    @Test
    public void testGetFigure() {

        //Given
        Shape testShape = new Square(4);
        List<Shape> testList = new ArrayList<Shape>();

        //When
        testList.add(0,testShape);

        //Then
        Assert.assertEquals(testList.get(0),testShape );
    }

    @Test
    public void testShowFigures() {

        //Given
        Shape testShape = new Square(4);
        //When
        String result = testShape.getShapeName();
        //Then
        Assert.assertEquals(result,"Square");
    }
}

