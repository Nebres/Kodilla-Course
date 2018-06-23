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
        Shape expected = new Square(4);
        List<Shape> testList = new ArrayList<Shape>();
        testList.add(expected);
        //When
        Shape actual = testList.get(0);
        //Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape shapeToRemove = new Square(4);
        Shape expected = new Triangle(2.00,3.00, 4.50);
        List<Shape> testList = new ArrayList<Shape>();
        testList.add(0,shapeToRemove);
        testList.add(expected);
        Shape actual = testList.get(0);
        //When
        testList.remove(0);
        //Then
        Assert.assertNotEquals(actual, expected);
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape expected = new Square(4);
        List<Shape> testList = new ArrayList<Shape>();
        testList.add(0,expected);
        //When
        Shape actual = testList.get(0);
        //Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testShowFiguresSquare() {
        //Given
        Shape addedShape = new Square(4);
        ArrayList<Shape> testList = new ArrayList<Shape>();
        String expected = "Square";
        testList.add(addedShape);
        //When
        String actual = testList.get(0).getShapeName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShowFiguresTriangle() {
        //Given
        Shape addedShape = new Triangle(13.0, 13.0, 24.0);
        ArrayList<Shape> testList = new ArrayList<Shape>();
        String expected = "Triangle";
        testList.add(addedShape);
        //When
        String actual = testList.get(0).getShapeName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShowFiguresCircle() {
        //Given
        Shape addedShape = new Circle(1.0);
        ArrayList<Shape> testList = new ArrayList<Shape>();
        String expected = "Circle";
        testList.add(addedShape);
        //When
        String actual = testList.get(0).getShapeName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetShapeNameForSquare() {
        //Given
        Shape addedShape = new Square(4);
        String expected = "Square";
        //When
        String actual = addedShape.getShapeName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetShapeNameForTriangle() {
        //Given
        Shape addedShape = new Triangle(13.0, 13.0, 24.0);
        String expected = "Triangle";
        //When
        String actual = addedShape.getShapeName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetShapeNameForCircle() {
        //Given
        Shape addedShape = new Circle(1.0);
        String expected = "Circle";
        //When
        String actual = addedShape.getShapeName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFiledForSquare() {
        //Given
        final double DELTA = 1e-2;
        double expected = 16.00;
        Shape addedShape = new Square(4.0);
        //When
        double actual = addedShape.getField();
        //Then
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testGetFiledForTriangle() {
        //Given
        final double DELTA = 1e-2;
        double expected = 60.00;
        Shape addedShape = new Triangle(13.0,13.0,24.0);
        //When
        double actual = addedShape.getField();
        //Then
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testGetFiledForCircle() {

        //Given
        final double DELTA = 1e-2;
        double expected = 3.14;
        Shape addedShape = new Circle(1.0);
        //When
        double actual = addedShape.getField();
        //Then
        Assert.assertEquals(expected, actual, DELTA);
    }

}

