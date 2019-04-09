package com.algr0403;

import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                list.add(i);
            }
        }
        if(list.size() == 0){
            list.add(-1);
            list.add(-1);
        }
        int[] res = new int[list.size()];
        for(int j = 0; j < res.length; j++){
            res[j] = list.get(j);
        }
        return res;
    }
}
