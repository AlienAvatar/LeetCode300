package com.algr0403;

public class SearchInRotatedSortedArray2 {
    //succed
    public boolean search(int[] nums, int target) {
        boolean re = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                re = true;
            }
        }
        return re;
    }
}
