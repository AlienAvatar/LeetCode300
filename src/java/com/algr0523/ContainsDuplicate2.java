package com.algr0523;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k >= nums.length){
            return true;
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    if(Math.abs(i-j)<=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
