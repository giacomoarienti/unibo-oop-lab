package it.unibo.shapes.test;

import it.unibo.shapes.api.Polygon;
import it.unibo.shapes.api.Shape;
import it.unibo.shapes.impl.Circle;
import it.unibo.shapes.impl.Rectangle;
import it.unibo.shapes.impl.Square;
import it.unibo.shapes.impl.Triangle;

public class WorkWithShapes {
    public static void main(String[] args) {
        final Shape circle = new Circle(5);
        final Polygon triangle = new Triangle(2, 9);
        final Polygon square = new Square(3);
        final Polygon rectangle = new Rectangle(2, 3);
        //print the areas and perimeters
        System.out.println(circle);
        System.out.println(triangle);
        System.out.println(square);
        System.out.println(rectangle);
    }
}
