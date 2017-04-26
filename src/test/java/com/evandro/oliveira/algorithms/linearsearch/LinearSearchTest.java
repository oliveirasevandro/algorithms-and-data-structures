package com.evandro.oliveira.algorithms.linearsearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by eso on 25/04/17.
 */
public class LinearSearchTest {

    private LinearSearch l;

    @Before
    public void init() {
        l = new LinearSearch();
    }

    @Test
    public void searchSuccess() {

        int[] array = {5, 1, 8, 9, 32, 34};

        assertEquals(0, l.search(5, array));
        assertEquals(3, l.search(9, array));
        assertEquals(5, l.search(34, array));
    }

    @Test
    public void searchNotFound() {

        int[] array = {5, 1, 8, 9, 32, 34};

        assertEquals(-1, l.search(90, array));
    }


}
