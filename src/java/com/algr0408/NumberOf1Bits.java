package com.algr0408;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        if(n < 0){
            return -1;
        }
        n ^= 2;
        return 0;
    }
}
