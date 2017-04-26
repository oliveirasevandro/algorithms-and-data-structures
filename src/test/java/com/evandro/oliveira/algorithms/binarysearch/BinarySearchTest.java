package com.evandro.oliveira.algorithms.binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by eso on 26/04/17.
 */
public class BinarySearchTest {

    BinarySearch bs;

    @Before
    public void setUp() throws Exception {

        bs = new BinarySearch();
    }

    @Test
    public void searchTest() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Assert.assertEquals(3, bs.search(array, 4));
        Assert.assertEquals(0, bs.search(array, 1));
        Assert.assertEquals(7, bs.search(array, 8));
    }

    @Test
    public void searchNotFoundTest() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Assert.assertEquals(-1, bs.search(array, 0));
        Assert.assertEquals(-1, bs.search(array, 12));
    }
}
