package com.company.assign;

public class Main {
    public static void main(String[] args) {

            Rectangle rectangle = new Rectangle();
            rectangle.perimeter(4,5, 0, 0);
            rectangle.area(4,5, 0, 0);
            System.out.println(".");

            Square square = new Square();
            square.perimeter(5,5, 0, 0);
            square.area(5,5, 0, 0);
            System.out.println(".");

            Circle circle = new Circle();
            circle.perimeter(5,0, 0, 0);
            circle.area(5,0,0, 0);
            System.out.println(".");

            Triangle triangle = new Triangle();
            triangle.perimeter(3,4,5,3);
            triangle.area(3,4,5,3);
        }
}
