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
        Assert.assertEquals(testList.get(0), testShape);
    }

    @Test
    public void testRemoveFigure() {

        //Given
        Shape testShape = new Square(4);
        Shape testShape2 = new Triangle(2.00,3.00, 4.50);
        List<Shape> testList = new ArrayList<Shape>();
        testList.add(0,testShape);
        testList.add(testShape2);

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
        Shape testShape2 = new Circle(1.0);
        Shape testShape3 = new Triangle(13.0, 13.0, 24.0);
        ArrayList<Shape> testList = new ArrayList<Shape>();

        //When
        testList.add(testShape);
        testList.add(testShape2);
        testList.add(testShape3);

        //Then
        Assert.assertEquals(testList.get(0).getShapeName(), "Square");
        Assert.assertEquals(testList.get(1).getShapeName(), "Circle");
        Assert.assertEquals(testList.get(2).getShapeName(), "Triangle");
    }

    @Test
    public void testGetShapeName() {


        //Given
        Shape testShape = new Square(4);
        Shape testShape2 = new Circle(1.0);
        Shape testShape3 = new Triangle(13.0,13.0,24.0);

        //When
        String result = testShape.getShapeName();
        String result2 = testShape2.getShapeName();
        String result3 = testShape3.getShapeName();

        //Then
        Assert.assertEquals(result,"Square");
        Assert.assertEquals(result2,"Circle");
        Assert.assertEquals(result3,"Triangle");
    }

    @Test
    public void testGetFiled() {

        //Given
        Shape testShape = new Square(4.0);
        Shape testShape2 = new Circle(1.0);
        Shape testShape3 = new Triangle(13.0,13.0,24.0);

        //When
        double result = testShape.getField();
        double result2 = testShape2.getField();
        double result3 = testShape3.getField();

        //Then
        Assert.assertTrue(result == 16.0 && result2 == 3.141592653589793 && result3 == 60.0);
    }
}

