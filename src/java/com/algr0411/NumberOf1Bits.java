package com.algr0411;

/**
 * Input: 00000000000000000000000000001011
 * Output: 3
 * Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int c = 0;
        while(n != 0){
            c+= (n & 1);
            n = n >> 1;
        }
        return c;
    }
}
