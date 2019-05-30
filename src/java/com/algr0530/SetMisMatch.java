package com.algr0530;

import com.algr0414.ArrayPartition1;

import java.util.*;

public class SetMisMatch {
    public int[] findErrorNums(int[] nums) {
        int dup = -1,mis = -1;
        for(int i = 1; i <= nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == i){
                    count++;
                }
            }

            if(count == 2){
                dup = i;
            }else if(count == 0){
                mis = i;
            }
        }
        return new int[]{dup,mis};
    }

}
