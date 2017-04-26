package com.evandro.oliveira.algorithms.linearsearch;

/**
 * Linear search algorithm
 *
 * This algorithm searches into an array until the number to be searched matches a value
 * if no match is found, -1 will be returned
 *
 * Created by eso on 25/04/17.
 */
public class LinearSearch {

    public int search(int number, int[] array) {

        for (int x = 0; x < array.length; x++) {
            if (array[x] == number) {
                return x;
            }
        }

        return -1;

    }


}
