package com.evandro.oliveira.algorithms.quicksort;

/**
 * Created by eso on 27/04/17.
 */
public class QuickSort {

    public int[] sort(int[] array) {

        return sort(array, 0, array.length - 1);
    }

    private int[] sort(int[] array, int low, int high) {

        int initLow = low;
        int initHigh = high;
        int mid = low + ((high - low) / 2);
        int pivot = array[mid];

        while (low <= high) {
            while (array[low] < pivot) low++;
            while (array[high] > pivot) high--;

            if (low <= high) {
                swap(array, low, high);
                low++;
                high--;
            }
        }

        if (initLow < high) sort(array, initLow, high);
        if (low < initHigh) sort(array, low, initHigh);

        return array;

    }

    private void swap(int[] array, int low, int high) {

        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;

    }
}
