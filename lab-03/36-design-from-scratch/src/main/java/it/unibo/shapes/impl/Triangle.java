package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Triangle implements Polygon {
    private static final int EDGES = 3;
    private final double base;
    private final double height;

    public Triangle(final double base, final double height) {
        this.base = base;
        this.height = height;
    }

    private double getSide() {
        return Math.sqrt(Math.pow(this.base / 2, 2) + Math.pow(this.height, 2));
    }

    public double area() {
       return this.base * this.height / 2;
    }

    public double perimeter() {
        return this.getSide() * 2 + this.base; 
    }

    public int getEdgeCount() {
       return Triangle.EDGES;
    }

    public String toString() {
        return "Triangle ["
        + "base=" + this.base
        + ", height=" + this.height
        + ", edges=" + Triangle.EDGES
        + ", area=" + this.area()
        + ", perimeter" + this.perimeter()
        +"]";
    }
}
