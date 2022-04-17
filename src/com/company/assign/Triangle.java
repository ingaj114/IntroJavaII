package com.company.assign;

public class Triangle implements Shape {

    @Override
    public void perimeter(double sideA, double sideB, double sideC, double height) { //height 0
        double perimeter = sideA + sideB + sideC;
        if (sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB) {
            if (sideA == sideB && sideB == sideC && sideA == sideC) {
                System.out.println("Equilateral`s triangle`s perimeter is " + perimeter);
            } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
                System.out.println("Isosceles`s triangle`s perimeters is " + perimeter);
            } else if (Math.pow(sideC, 2) == Math.pow(sideA, 2) + Math.pow(sideB, 2)) {
                System.out.println("Right-angled triangle`s perimeter is " + perimeter);
            } else if (sideA != sideB && sideB != sideC) {
                System.out.println("Scalene triangle's perimeter is " + perimeter);
            }
        }
        else System.out.println("The two side's sum of triangle should be bigger than third side!");
    }
    @Override
    public void area(double sideA, double sideB, double sideC, double height) {
        double area = sideB/2 * height;
        if (sideA == sideB && sideB == sideC && sideA == sideC) {
            System.out.println("Equilateral`s triangle`s area is " + (Math.sqrt(3) / 4 * (Math.pow(sideA, 2)))); // height 0
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            System.out.println("Isosceles`s triangle`s area is " + area);
        } else if (Math.pow(sideC, 2) == Math.pow(sideA, 2) + Math.pow(sideB, 2)) {
            System.out.println("Right-angled triangle`s area is " + (sideA/2*sideB));
        } else {
            System.out.println("Scalene triangle's area is " + area);
        }
    }

}
