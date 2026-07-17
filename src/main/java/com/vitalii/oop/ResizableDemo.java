package com.vitalii.oop;

// 1. Define the Resizable interface
interface Resizable {
    void resizeWidth(int width);

    void resizeHeight(int height);
}

// 2. Implement the interface in the Rectangle class
class Rectangle implements Resizable {
    private int width;
    private int height;

    // Constructor to initialize original dimensions
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implementing the resizeWidth method from the interface
    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Resized width to: " + width);
    }

    // Implementing the resizeHeight method from the interface
    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Resized height to: " + height);
    }

    // Helper method to display current dimensions
    public void displayInfo() {
        System.out.println("Rectangle: Width = " + width + ", Height = " + height);
    }
}

// 3. Renamed main class to execute and test the program
public class ResizableDemo {
    public static void main(String[] args) {
        // Create a Rectangle instance with initial dimensions
        Rectangle rect = new Rectangle(10, 5);

        System.out.println("--- Original Dimensions ---");
        rect.displayInfo();

        System.out.println("\n--- Resizing Object ---");
        rect.resizeWidth(15);
        rect.resizeHeight(8);

        System.out.println("\n--- Updated Dimensions ---");
        rect.displayInfo();
    }
}
