package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private final static ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int i) {
        return shapeList.get(i);
    }

    public void showFigures() {
        for (Shape shape : shapeList) {
            System.out.println(shape.getShapeName());
        }
    }

}
