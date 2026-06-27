package com.vitalii.oop;

public class HomeAreaCalculator {
    static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);

        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(75, 35);

        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("The area of booth rooms is: " + totalArea);
    }
}
