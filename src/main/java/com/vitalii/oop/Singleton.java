package com.vitalii.oop;

public class Singleton {
    // This variable stores our one and only instance
    private static Singleton singleInstance = null;

    // Private constructor blocks outside classes from creating instances
    private Singleton() {
        System.out.println("-> Success: New Singleton instance created!");
    }

    // Public method acts as the global gateway to get the instance
    public static Singleton getInstance() {
        // Create the instance only if it does not exist yet
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    public static void main(String[] args) {
        System.out.println("--- Step 1: Requesting the first instance ---");
        Singleton firstCall = Singleton.getInstance();

        System.out.println("\n--- Step 2: Requesting a second instance ---");
        Singleton secondCall = Singleton.getInstance();

        System.out.println("\n--- Step 3: Verification Check ---");
        if (firstCall == secondCall) {
            System.out.println("Result: Both variables point to the exact same object.");
        } else {
            System.out.println("Result: They are different objects.");
        }
    }
}
