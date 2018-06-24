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
        Shape expected = new Triangle(2.00,3.00);
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
    public void testShowFigures() {
        //Given
        Shape addedShape = new Square(4);
        Shape addedShape2 = new Triangle(13.0, 13.0);
        Shape addedShape3 = new Circle(1.0);
        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(addedShape);
        shapeList.add(addedShape2);
        shapeList.add(addedShape3);
        List<String> expected = new ArrayList<String>();
        expected.add("Square");
        expected.add("Triangle");
        expected.add("Circle");
        //When
        List<String> actual = new ArrayList<String>();
        for ( Shape shape : shapeList) {
            actual.add(shape.getShapeName());
        }
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
        Shape addedShape = new Triangle(13.0, 13.0);
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
        double expected = 16.00;
        Shape addedShape = new Square(4.0);
        //When
        double actual = addedShape.getField();
        //Then
        Assert.assertEquals(expected, actual, 1e-2);
    }

    @Test
    public void testGetFiledForTriangle() {
        //Given
        double expected = 4.00;
        Shape addedShape = new Triangle(4.0,2.0);
        //When
        double actual = addedShape.getField();
        //Then
        Assert.assertEquals(expected, actual, 1e-2);
    }

    @Test
    public void testGetFiledForCircle() {

        //Given
        double expected = 3.14;
        Shape addedShape = new Circle(1.0);
        //When
        double actual = addedShape.getField();
        //Then
        Assert.assertEquals(expected, actual, 1e-2);
    }

}

