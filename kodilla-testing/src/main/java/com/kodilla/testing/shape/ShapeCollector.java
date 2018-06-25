package com.kodilla.testing.shape;

import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeList;

    public ShapeCollector(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public void addFigure(Shape shape) {
        this.shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        this.shapeList.remove(shape);
    }

    public Shape getFigure(int i) {
        return this.shapeList.get(i);
    }

    public String showFigures() {

        StringBuilder builder = new StringBuilder();
        String allShape = "";

        for ( Shape shape : this.shapeList) {
            String temp = shape.getShapeName();
            allShape = builder.append(temp + " | ").toString();
        }
        return allShape;
    }

}
