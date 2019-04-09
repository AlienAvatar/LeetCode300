package com.algr0408;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber {

    //succed
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length-1] == nums.length-1){
            return nums.length;
        }
        int re = 0;

        for(int i = 0; i < nums.length; i++){
            if(i == nums[i]){
                re = i;
            }else{
                return i;
            }
        }
        return re;
    }
}
