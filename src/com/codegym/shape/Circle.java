package com.codegym.shape;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        //super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        //super();
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }

    public double getPerimeter(){
        return Math.PI*2*this.radius;
    }

    @Override
    public String toString(){
        return "A Circle with radius = "+this.radius+", which is a subclass of shape";
    }

}
