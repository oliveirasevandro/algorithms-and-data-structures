package com.evandro.oliveira.algorithms.quicksort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by eso on 27/04/17.
 */
public class QuickSortTest {

    QuickSort qs;

    @Before
    public void setUp() throws Exception {
        qs = new QuickSort();
    }

    @Test
    public void sortTest() {

        int[] array = {7, 1, 5, 10, 2};
        int[] expected = {1, 2, 5, 7, 10};

        array = qs.sort(array);

        assertArrayEquals(expected, array);

    }
}
