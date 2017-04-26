package com.evandro.oliveira.algorithms.binarysearch;

/**
 * Created by eso on 26/04/17.
 */
public class BinarySearch {

    public int search(int[] array, int key) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int mid = getMiddleIndex(low, high);

            if (key < array[mid]) high = mid - 1;
            else if (key > array[mid]) low = mid + 1;
            else return mid;
        }


        return -1;
    }

    private int getMiddleIndex(int low, int high) {
        return low + ((high - low) / 2);
    }
}
