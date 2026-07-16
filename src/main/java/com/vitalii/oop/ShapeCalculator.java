package com.vitalii.oop;

// Abstract base class
abstract class GeometricShape {
    // Abstract methods to be implemented by subclasses
    public abstract double area();

    public abstract double perimeter();
}

// Subclass representing a Square
class Square extends GeometricShape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Implement area for a square: side * side
    @Override
    public double area() {
        return side * side;
    }

    // Implement perimeter for a square: 4 * side
    @Override
    public double perimeter() {
        return 4 * side;
    }
}

// Subclass representing a Triangle
class Triangle extends GeometricShape {
    private double sideA;
    private double sideB;
    private double sideC;

    // Constructor
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Implement area using Heron's Formula
    @Override
    public double area() {
        double s = perimeter() / 2; // Semi-perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    // Implement perimeter for a triangle: sideA + sideB + sideC
    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        // Create a Square with a side length of 5.0
        GeometricShape square = new Square(5.0);
        System.out.println("--- Square Properties ---");
        System.out.printf("Area: %.2f\n", square.area());
        System.out.printf("Perimeter: %.2f\n\n", square.perimeter());

        // Create a Triangle with sides 3.0, 4.0, and 5.0
        GeometricShape triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("--- Triangle Properties ---");
        System.out.printf("Area: %.2f\n", triangle.area());
        System.out.printf("Perimeter: %.2f\n", triangle.perimeter());
    }
}
