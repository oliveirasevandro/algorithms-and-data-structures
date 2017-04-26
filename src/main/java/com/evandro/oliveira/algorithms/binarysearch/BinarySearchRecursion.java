package com.evandro.oliveira.algorithms.binarysearch;

/**
 * Created by eso on 26/04/17.
 */
public class BinarySearchRecursion {

    int[] array;
    int key;

    public int search(int[] array, int key) {

        this.array = array;
        this.key = key;

        return search(0, array.length - 1);
    }

    private int search(int low, int high) {

        if (low > high) return -1;

        int mid = getMiddleIndex(low, high);

        if (key < array[mid]) return search(low, mid - 1);
        else if (key > array[mid]) return search(mid + 1, high);

        return mid;
    }

    private int getMiddleIndex(int low, int high) {
        return low + ((high - low) / 2);
    }
}
