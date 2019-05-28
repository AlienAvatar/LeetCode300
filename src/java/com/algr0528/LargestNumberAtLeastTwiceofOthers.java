package com.algr0528;

import java.util.Arrays;

public class LargestNumberAtLeastTwiceofOthers {
    public int dominantIndex(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
            temp[i] = nums[i];
        }

        Arrays.sort(temp);
        int max = temp[temp.length-1];
        if(temp.length >= 2 && max >= temp[temp.length-2]*2){
            for(int i = 0; i < nums.length;i++){
                if(max == nums[i]){
                    return i;
                }
            }
        }else if(temp.length == 1){
            return 0;
        }
        return -1;
    }
}
