package com.evandro.oliveira.algorithms.euclid;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by eso on 25/04/17.
 */
public class EuclidTest {

    @Test
    public void cgdTest() {

        Euclid euclid = new Euclid();
        assertEquals(2, euclid.cgd(22, 6));
    }

}
