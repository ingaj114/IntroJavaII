package com.company.assign;

public class Rectangle implements Shape {

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double perimeter() {
        if (length != width) {
            return length * 2 + width * 2;
        } else return 0;
    }
    public double area() {
        if (length != width) {
            return length * width;
        } else return 0;
    }
}
