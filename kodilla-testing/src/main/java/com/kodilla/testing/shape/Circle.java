package com.kodilla.testing.shape;

public class Circle implements Shape{

    private double diameterOfTheWheel;

    public Circle(double diameterOfTheWheel) {
        this.diameterOfTheWheel = diameterOfTheWheel;
    }

    public String getShapeName(){
        return "Circle";
    }

    public double getField() {
        return Math.PI * Math.pow(diameterOfTheWheel, 2.00);
    }
}

