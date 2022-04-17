package com.company.assign;

public class Triangle3 implements Shape {
    public double a;
    public double base;
    public double h;

    public Triangle3(double a, double base, double h) {
        this.a = a;
        this.base = base;
        this.h = h;
    }

    public double perimeter() {
        if (a * 2 > base) { //sum of sides should be bigger than base
            return a * 2 + base;
        } else return 0;
    }

    public double area() {
        return (base * h) / 2;
    }

}
