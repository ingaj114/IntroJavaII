package com.company.assign;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Circle perimeter: " + Math.round(circle.perimeter()));
        System.out.println("Circle area: " + Math.round(circle.area()));

        Square square = new Square(3, 3);
        System.out.println("Square perimeter: " + square.perimeter());
        System.out.println("Square area: " + square.area());

        Rectangle rectangle = new Rectangle(2, 8);
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle area: " + rectangle.area());

        Triangle triangle = new Triangle(5, 8, 5, 6);
        System.out.println("General triangle`s perimeter is " + triangle.perimeter());
        System.out.println("General triangle`s area: " + triangle.area());
    }

}
