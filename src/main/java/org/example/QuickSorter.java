package org.example;

public class QuickSorter<T extends Comparable<T>> implements Sorter<T> {
    @Override
    public void sort(T[] list) {
        if (list == null || list.length == 0) {
            return;
        }
        quickSort(list, 0, list.length - 1);
    }

    private void quickSort(T[] list, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(list, low, high);

            // Recursively sort the elements before and after the partition index
            quickSort(list, low, partitionIndex - 1);
            quickSort(list, partitionIndex + 1, high);
        }
    }

    private int partition(T[] list, int low, int high) {
        T pivot = list[high]; // Choose the pivot as the last element
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (list[j].compareTo(pivot) <= 0) {
                i++;

                // Swap list[i] and list[j]
                T temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        // Swap list[i+1] and pivot
        T temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;

        return i + 1;
    }
}