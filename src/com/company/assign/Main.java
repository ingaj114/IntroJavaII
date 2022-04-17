package com.company.assign;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Circle's perimeter: " + Math.round(circle.perimeter()));
        System.out.println("Circle's area: " + Math.round(circle.area()));

        Square square = new Square(3, 3);
        System.out.println("Square's perimeter: " + square.perimeter());
        System.out.println("Square's area: " + square.area());

        Rectangle rectangle = new Rectangle(2, 8);
        System.out.println("Rectangle's perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle's area: " + rectangle.area());

        Triangle triangle = new Triangle(5, 8, 5, 6);
        System.out.println("General triangle's perimeter is " + triangle.perimeter());
        System.out.println("General triangle's area: " + triangle.area());

        Triangle2 triangle2 = new Triangle2(2);
        System.out.println("Equilateral triangle's perimeter is " + triangle2.perimeter());
        System.out.println("Equilateral triangle's area is " + (float)triangle2.area());

        Triangle3 triangle3 = new Triangle3(5,8,3);
        System.out.println("Isosceles triangle's perimeter is " + triangle3.perimeter());
        System.out.println("Isosceles triangle's area is " + triangle3.area());

    }
}
