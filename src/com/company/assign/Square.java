package com.company.assign;

public class Square implements Shape {
    public double length;
    public double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double perimeter() {
        if (length == width) {
            return length * 4;
        } else return 0;
    }
    public double area() {
        if (length == width) {
            return length * width;
        } else return 0;
    }
}
