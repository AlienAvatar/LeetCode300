package com.algr0412;

/**
 * Math
 */
public class Sqrt {
    public int mySqrt(int x) {
        return (int)sqrt(x);
    }

    public double sqrt(int n){
        double guess = 1.0;
        while(Math.abs(n - guess * guess)> 0.1){
            guess = (n/guess + guess) / 2;
        }
        return guess;
    }
}
