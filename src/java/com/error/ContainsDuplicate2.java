package com.error;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k >= nums.length){
            return true;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(i,nums[i]);
        }


        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(map.get(entry.getKey() + k) != null) {
                if (map.get(entry.getKey() + k) <= entry.getValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
