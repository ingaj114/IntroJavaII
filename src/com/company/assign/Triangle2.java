package com.company.assign;

public class Triangle2 implements Shape {

    public double a;

    public Triangle2 (double a) {
        this.a = a;
    }

    public double perimeter() {
        return a * 3;
    }

    public double area() {
        return Math.sqrt(3) / 4 * Math.pow(a,2);
    }
}
