package com.vitalii.oop;

import java.util.Arrays;

// Define the Sortable interface
interface Sortable {
    void sort(int[] array);
}

// Implementation using the Bubble Sort algorithm
class BubbleSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

// Implementation using the Selection Sort algorithm
class SelectionSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}

public class SortingDemo {
    static void main() {
        // Sample array for Bubble Sort
        int[] bubbleData = {64, 34, 25, 12, 22, 11, 90};
        Sortable bubbleSorter = new BubbleSort();

        System.out.println("Original array (Bubble Sort): " + Arrays.toString(bubbleData));
        bubbleSorter.sort(bubbleData);
        System.out.println("Sorted array (Bubble Sort):   " + Arrays.toString(bubbleData));

        System.out.println(); // Formatting spacing

        // Sample array for Selection Sort
        int[] selectionData = {29, 10, 14, 37, 13, -5, 8};
        Sortable selectionSorter = new SelectionSort();

        System.out.println("Original array (Selection Sort): " + Arrays.toString(selectionData));
        selectionSorter.sort(selectionData);
        System.out.println("Sorted array (Selection Sort):   " + Arrays.toString(selectionData));
    }
}
