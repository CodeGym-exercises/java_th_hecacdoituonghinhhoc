package com.codegym.shape;

public class Square extends Shape {
    private double size;

    public Square( ) {
        this.size = 1.0;
    }

    public Square(double size) {
        this.size = size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString(){
        return "A Square with size = "+this.size+", which is a subclass of yyy";
    }
}
