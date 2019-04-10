package com.algr0410;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFormSortedArray {
    /**
     * leetcode bug
     * @param nums
     * @return
     */
    /*public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int j = 0;
        int[] res = new int[set.size()];
        for(int i : set){
            res[j++] = i;
        }
        Arrays.sort(res);
        nums = res;
        return set.size();
    }*/

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        for(int j = 1; j < nums.length;j++){
            if(nums[j] != nums[i]){
                nums[i++] = nums[j];
            }
        }
        return i+1;
    }
}
