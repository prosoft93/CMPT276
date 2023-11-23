package org.example;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class QuickSorterTest {

    @Test
    public void testSortIntegerArray() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {5, 2, 9, 1, 5, 6};
        sorter.sort(array);
        Integer[] expected = {1, 2, 5, 5, 6, 9};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortStringArray() {
        Sorter<String> sorter = createSorter();
        String[] array = {"apple", "orange", "banana", "grape", "kiwi"};
        sorter.sort(array);
        String[] expected = {"apple", "banana", "grape", "kiwi", "orange"};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortEmptyArray() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {};
        sorter.sort(array);
        Integer[] expected = {};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithSingleElement() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {42};
        sorter.sort(array);
        Integer[] expected = {42};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortAlreadySortedArray() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {1, 2, 3, 4, 5};
        sorter.sort(array);
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortReverseSortedArray() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {5, 4, 3, 2, 1};
        sorter.sort(array);
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithDuplicates() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        sorter.sort(array);
        Integer[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortNullArray() {
        Sorter<String> sorter = createSorter();
        String[] array = null;
        sorter.sort(array);
        String[] expected = null;
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortStringArrayWithSingleElement() {
        Sorter<String> sorter = createSorter();
        String[] array = {"apple"};
        sorter.sort(array);
        String[] expected = {"apple"};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortLargeRandomArray() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {5, 8, 2, 7, 1, 9, 3, 6, 4, 10};
        sorter.sort(array);
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expected, array);
    }

    private <T extends Comparable<T>> Sorter<T> createSorter() {
        // Implement the method to create a sorter (e.g., QuickSorter or BubbleSorter)
        // based on your actual implementation.
        return new QuickSorter<>();
    }
}