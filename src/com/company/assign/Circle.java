package com.company.assign;

public class Circle implements Shape {

    @Override
    public void perimeter(double sideA, double sideB, double sideC, double height) { //length as radius, sideB 0, sideC 0, height 0
        System.out.println("The perimeter of circle is " + 2 * Math.PI * sideA);
    }

    @Override
    public void area(double sideA, double sideB, double sideC, double height) { //length as radius, sideB 0, sideC 0, height 0
        System.out.println("The area of circle is " + Math.PI * Math.pow(sideA,2));
    }
}
