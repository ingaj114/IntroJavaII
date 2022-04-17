package com.company.assign;

public class Triangle implements Shape {

    public double a;
    public double base;
    public double b;
    public double h;

    public Triangle (double a, double base, double b, double h) {
        this.a = a;
        this.base = base;
        this.b = b;
        this.h = h;
    }

    public double perimeter() {
        if (a + base > b && base + b > a && b + a > base) { // side + side > base
            return a + base + b;
        } return 0;
    }

    public double area() {
        if (a + base > b && base + b > a && b + a > base) { // side + side > base
            return (base * h)/2;
        } return 0;
    }
}
