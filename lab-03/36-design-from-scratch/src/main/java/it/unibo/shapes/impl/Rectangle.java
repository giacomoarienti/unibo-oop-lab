package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon {
    private static final int EDGES = 4;
    private final double base;
    private final double height;

    public Rectangle(final double base, final double height) {
        this.base = base;
        this.height = height;        
    }

    public double area() {
       return this.base * this.height;
    }

    public double perimeter() {
        return this.base * 2 + this.height * 2;
    }

    public int getEdgeCount() {
       return Rectangle.EDGES;
    }

    public String toString() {
        return "Rectangle ["
        + "base=" + this.base
        + ", height=" + this.height
        + ", edges=" + Rectangle.EDGES
        + ", area=" + this.area()
        + ", perimeter" + this.perimeter()
        +"]";
    }
}
