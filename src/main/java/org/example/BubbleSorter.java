package org.example;

public class BubbleSorter<T extends Comparable<T>> implements Sorter<T> {
    @Override
    public void sort(T[] list) {
        if (list == null || list.length <= 1) {
            return; // Already sorted
        }

        int n = list.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // If the element found is greater than the next element, swap them
                if (list[j].compareTo(list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}