package com.evandro.oliveira.algorithms.euclid;

/**
 * Created by eso on 25/04/17.
 */
public class Euclid {

    public int cgd(int number, int divisor) {

        int remaining = number % divisor;

        if (remaining == 0) {
            return divisor;
        } else {
            return cgd(divisor, remaining);
        }

    }


}
