package it.unibo.shapes.impl;

import java.lang.Math;
import it.unibo.shapes.api.Shape;

public class Circle implements Shape {
    private final double r;

    public Circle(final double r) {
        this.r = r;
    }

    public double area() {
        return this.r * this.r * Math.PI;
    }

    public double perimeter() {
        return 2 * this.r * Math.PI;
    }

    public String toString() {
        return "Circle ["
        + "r=" + this.r
        + ", area=" + this.area()
        + ", perimeter" + this.perimeter()
        +"]";
    }
    
}
