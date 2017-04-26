package com.evandro.oliveira.algorithms.insertsort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by eso on 25/04/17.
 */
public class InsertSortTest {

    private InsertSort i;

    @Before
    public void init() {
        i = new InsertSort();
    }


    @Test
    public void swapTest() {

        int[] array = {3, 5, 2, 1};
        i.swap(array, 1, 2);
        int[] expected = {3, 2, 5, 1};

        assertArrayEquals(expected, array);

    }

    @Test
    public void sortTest() {

        int[] array = {10, 7, 3, 6, 4, 12};
        int[] expected = {3, 4, 6, 7, 10, 12};

        array = i.sort(array);

        assertArrayEquals(expected, array);
    }


    @Test
    public void sortRepeatedTest() {

        int[] array = {10, 4, 10, 6, 4, 12};
        int[] expected = {4, 4, 6, 10, 10, 12};

        array = i.sort(array);

        assertArrayEquals(expected, array);
    }
}
