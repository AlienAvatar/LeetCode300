package com.algr0403;

public class SearchInRotatedSortedArray {
    //succeed
    public int search(int[] nums, int target) {
        int re = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                re = i;
            }
        }
        return re;
    }
}
