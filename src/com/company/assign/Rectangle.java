package com.company.assign;

public class Rectangle implements Shape {

    @Override
    public void perimeter(double sideA, double sideB, double sideC, double height) { // sideC 0, height 0
        if (sideA != sideB) {
            System.out.println("Perimeter of rectangle is " + (sideA + sideB) * 2);
        } else System.out.println("Not a rectangle!");
    }

    @Override
    public void area(double sideA, double sideB, double sideC, double height) { //sideC 0, height 0
        if (sideA != sideB) {
            System.out.println("The area of rectangle is " + sideA * sideB);
        } else System.out.println("Not a rectangle!");
    }
}
