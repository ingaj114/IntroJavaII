package com.company.assign;

public class Square implements Shape {
    @Override
    public void perimeter(double sideA, double sideB, double sideC, double height) { // sideC 0, height 0
        if (sideA == sideB) {
            System.out.println("The perimeter of square is " + (sideA * 4));
        } else System.out.println("Not a square!");
    }

    @Override
    public void area(double sideA, double sideB, double sideC, double height) { // sideC 0, height 0
        if (sideA == sideB) {
            System.out.println("The area of square is " + sideA * sideB);
        } else System.out.println("Not a square!");
    }
}
