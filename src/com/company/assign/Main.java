package com.company.assign;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Circle's perimeter: " + (float)circle.perimeter());
        System.out.println("Circle's area: " + (float)circle.area());
        System.out.println();

        Square square = new Square(3, 3);
        System.out.println("Square's perimeter: " + square.perimeter());
        System.out.println("Square's area: " + square.area());
        System.out.println();

        Rectangle rectangle = new Rectangle(2, 8);
        System.out.println("Rectangle's perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle's area: " + rectangle.area());
        System.out.println();

        Triangle triangle = new Triangle(5, 8, 4, 6);
        System.out.println("General triangle's perimeter is " + triangle.perimeter());
        System.out.println("General triangle's area: " + triangle.area());
        System.out.println();

        Triangle2 triangle2 = new Triangle2(2);
        System.out.println("Equilateral triangle's perimeter is " + triangle2.perimeter());
        System.out.println("Equilateral triangle's area is " + (float)triangle2.area());
        System.out.println();

        Triangle3 triangle3 = new Triangle3(5,8,3);
        System.out.println("Isosceles triangle's perimeter is " + triangle3.perimeter());
        System.out.println("Isosceles triangle's area is " + triangle3.area());

    }
}
