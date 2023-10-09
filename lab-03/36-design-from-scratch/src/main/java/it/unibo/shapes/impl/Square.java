package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Square implements Polygon {
    private static final int EDGES = 4;
    private final double l;

    public Square(final double l) {
        this.l = l;
    }

    public double area() {
       return this.l * this.l;
    }

    public double perimeter() {
        return this.l * Square.EDGES;
    }

    public int getEdgeCount() {
       return Square.EDGES;
    }

    public String toString() {
        return "Square ["
        + "l=" + this.l
        + ", edges=" + Square.EDGES
        + ", area=" + this.area()
        + ", perimeter" + this.perimeter()
        +"]";
    }
}
