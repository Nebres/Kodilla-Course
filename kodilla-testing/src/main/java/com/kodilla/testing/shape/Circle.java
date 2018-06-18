package com.kodilla.testing.shape;

public class Circle implements Shape{

    private double diameterOfTheWheel;

    public Circle(double diameterOfTheWheel) {
        this.diameterOfTheWheel = diameterOfTheWheel;
    }

    @Override
    public String getShapeName(){
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(diameterOfTheWheel, 2.00);
    }
}

