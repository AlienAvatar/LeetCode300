package com.algr0414;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 * Example 1:
 * Input: [1,4,3,2]
 *
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 */
public class ArrayPartition1 {
    /**
     *
     * @param nums
     * @return
     */
    //succed
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int re = 0;
        for(int i = 0; i < nums.length-1; i=i+2){
            int t = Math.min(nums[i],nums[i+1]);
            re += t;
        }
        return re;
    }
}
