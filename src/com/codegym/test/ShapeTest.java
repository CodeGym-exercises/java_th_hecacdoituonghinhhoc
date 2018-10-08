package com.codegym.test;
import com.codegym.shape.Circle;
import com.codegym.shape.Rectangle;
import com.codegym.shape.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        System.out.printf("Rectangle:\narea: %e\nperimeter: %e",rectangle.getArea(),rectangle.getPerimeter());
        System.out.printf("\nCircle:\narea: %e\nperimeter: %e",circle.getArea(),circle.getPerimeter());


    }
}
